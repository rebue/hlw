package rebue.hlw;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.Test;
import rebue.hlw.mo.HlwStudentMo;
import rebue.wheel.OkhttpUtils;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public class HlwStudentTest {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final String hostUrl = "http://127.0.0.1:9009";

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final String moData = "{\"id\":\"1\",\"studentCode\":\"1\",\"name\":\"1\",\"phone1\":\"1\",\"phone2\":\"1\",\"idCard\":\"1\",\"age\":\"1\",\"birthday\":1544429401633,\"sex\":\"1\",\"height\":\"1\",\"weight\":\"1\",\"isCpc\":true,\"regTime\":1544429401634}";

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final ObjectMapper mapper = new ObjectMapper();

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void addTest() throws JsonParseException, JsonMappingException, IOException {
        HlwStudentMo mo = new HlwStudentMo();
        mo = mapper.readValue(moData, HlwStudentMo.class);
        System.out.println("添加学生信息的参数为：" + mo);
        String result = OkhttpUtils.postByJsonParams(hostUrl + "/hlw/student", mo);
        System.out.println("添加学生信息的返回值为：" + result);
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void modifyTest() throws JsonParseException, JsonMappingException, IOException {
        HlwStudentMo mo = new HlwStudentMo();
        mo = mapper.readValue(moData, HlwStudentMo.class);
        System.out.println("修改学生信息的参数为：" + mo);
        String result = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", mo);
        System.out.println("修改学生信息的返回值为：" + result);
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void listTest() throws JsonParseException, JsonMappingException, IOException {
        String result = OkhttpUtils.get(hostUrl + "/hlw/student?pageNum=1&pageSize=5");
        System.out.println("查询学生信息的返回值为：" + result);
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void getByIdTest() throws JsonParseException, JsonMappingException, IOException {
        HlwStudentMo mo = new HlwStudentMo();
        mo = mapper.readValue(moData, HlwStudentMo.class);
        System.out.println("获取单个学生信息的参数为：" + mo.getId());
        String result = OkhttpUtils.get(hostUrl + "/hlw/student/getbyid?id=" + mo.getId());
        System.out.println("获取单个学生信息的返回值为：" + result);
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void delTest() throws JsonParseException, JsonMappingException, IOException {
        HlwStudentMo mo = new HlwStudentMo();
        mo = mapper.readValue(moData, HlwStudentMo.class);
        System.out.println("删除学生信息的参数为：" + mo.getId());
        String result = OkhttpUtils.delete(hostUrl + "/hlw/student?id=" + mo.getId());
        System.out.println("删除学生信息的返回值为：" + result);
    }
}
