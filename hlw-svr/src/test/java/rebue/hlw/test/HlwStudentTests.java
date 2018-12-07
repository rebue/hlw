package rebue.hlw.test;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import rebue.hlw.dic.SexDic;
import rebue.wheel.OkhttpUtils;

public class HlwStudentTests {

    private final String hostUrl = "http://127.0.0.1:9009/hlw/student";

    /**
     * 测试mybatis的枚举类型
     */
    @Test
    public void testMybatisEnum() throws IOException {
        final SexDic sex = SexDic.MALE;
        final String url = hostUrl + "/listbysex";
        final Map<String, Object> requestParams = new LinkedHashMap<>();
        requestParams.put("sex", sex.getCode());
        System.out.println(OkhttpUtils.get(url, requestParams));
    }

}
