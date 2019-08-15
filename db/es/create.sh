# 删除索引
curl -XDELETE 'localhost:9200/hlw-student'

# 创建索引及配置ik和pinyin分词器
curl -XPUT 'localhost:9200/hlw-student/?pretty' -H "Content-Type: application/json" -d '
{
    "settings":{
        "analysis": {
            "analyzer": {
                "default":{
                    "tokenizer":"ik_max_word"
                },
                "pinyin_analyzer": {
                    "type": "custom",
                    "tokenizer": "ik_max_word",
                    "filter": ["my_pinyin", "word_delimiter"]
                }
            },
            "filter": {
                "my_pinyin" : {
                    "type" : "pinyin",
                    "keep_first_letter" : true,
                    "keep_full_pinyin" : false,
                    "keep_none_chinese" : true,
                    "keep_original" : false,
                    "limit_first_letter_length" : 16,
                    "lowercase" : true,
                    "trim_whitespace" : true,
                    "keep_none_chinese_in_first_letter" : true
                }
            }
        }
    }
}'

# 列出所有索引
curl -X GET "localhost:9200/_cat/indices?v"

# 建立mapping
# term_vector-开启向量，用于高亮
curl -XPOST 'localhost:9200/hlw-student/_mappings?pretty' -H "Content-Type: application/json" -d '
{
    "properties": {
        "name": {
            "type": "keyword",
            "fields": {
                "pinyin": {
                    "type": "text",
                    "store": false,
                    "term_vector": "with_offsets",
                    "analyzer": "pinyin_analyzer",
                    "boost": 10
                }
            }
        },
        "birthday": {
            "type": "date"
        },
        "regTime": {
            "type": "date"
        }
    }
}'

# 测试
curl -XGET http://localhost:9200/hlw-student/_analyze?pretty -H "Content-Type: application/json" -d '
{
  "text": ["刘德华 张学友 郭富城 黎明 四大天王"],
  "analyzer": "pinyin_analyzer"
}'


curl -XGET http://localhost:9200/_analyze?pretty -H 'Content-Type:application/json' -d '
{
	"text": "内地港澳同胞:港珠澳大桥让港澳与国家融合更紧密"
	"analyzer": "pinyin",
}'