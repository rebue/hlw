package rebue.hlw;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;
import rebue.hlw.mo.HlwStudentMo;
import rebue.wheel.OkhttpUtils;
import rebue.wheel.test.MockDataUtils;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public class HlwStudentTests {

    /**
     *  @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final String hostUrl = "http://127.0.0.1:9009";

    /**
     *  @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void test() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        HlwStudentMo mo = (HlwStudentMo) MockDataUtils.newRandomPojo(new HlwStudentMo().getClass());
        System.out.println("添加学生信息的参数为：" + mo);
        String addResult = OkhttpUtils.postByJsonParams(hostUrl + "/hlw/student", mo);
        System.out.println("添加学生信息的返回值为：" + addResult);
        String listResult = OkhttpUtils.get(hostUrl + "/hlw/student?pageNum=1&pageSize=5");
        System.out.println("查询学生信息的返回值为：" + listResult);
        System.out.println("获取单个学生信息的参数为：" + mo.getId());
        String getByIdResult = OkhttpUtils.get(hostUrl + "/hlw/student/getbyid?id=" + mo.getId());
        System.out.println("获取单个学生信息的返回值为：" + getByIdResult);
        System.out.println("修改学生信息的参数为：" + mo);
        String modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", mo);
        System.out.println("修改学生信息的返回值为：" + modifyResult);
        System.out.println("删除学生信息的参数为：" + mo.getId());
        String deleteResult = OkhttpUtils.delete(hostUrl + "/hlw/student?id=" + mo.getId());
        System.out.println("删除学生信息的返回值为：" + deleteResult);
    }
}
