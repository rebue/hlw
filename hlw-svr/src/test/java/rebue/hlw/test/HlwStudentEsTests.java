package rebue.hlw.test;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import rebue.hlw.mo.HlwStudentMo;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.IdRo;
import rebue.robotech.ro.Ro;
import rebue.wheel.OkhttpUtils;
import rebue.wheel.RandomEx;

/**
 * 测试搜索引擎的学生信息
 *
 */
@Slf4j
public class HlwStudentEsTests {

    private final String       hostUrl       = "http://127.0.0.1:9009";

    private final ObjectMapper _objectMapper = new ObjectMapper();

    /**
     * 测试基本的增删改查
     */
    @Test
    public void testCrud() throws IOException, ReflectiveOperationException {
        addStudent("2015301");
        addStudent("2015302");
        addStudent("2015303");
        addStudent("2015304");
        addStudent("2015305");
        addStudent("2015306");
        addStudent("2015307");
        addStudent("2015308");

        HlwStudentMo student = addStudent("2015309");
        student.setName("张学友");
        log.info("修改学生信息的参数为：" + student);
        String modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", student);
        log.info("修改学生信息的返回值为：" + modifyResult);
        Ro modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());

        student = addStudent("2015310");
        student.setName("刘德华");
        log.info("修改学生信息的参数为：" + student);
        modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", student);
        log.info("修改学生信息的返回值为：" + modifyResult);
        modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());

        student = addStudent("2015311");
        student.setName("郭富城");
        log.info("修改学生信息的参数为：" + student);
        modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", student);
        log.info("修改学生信息的返回值为：" + modifyResult);
        modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());

        student = addStudent("2015312");
        student.setName("黎明");
        log.info("修改学生信息的参数为：" + student);
        modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/hlw/student", student);
        log.info("修改学生信息的返回值为：" + modifyResult);
        modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());

        log.info("获取单个学生信息的参数为：" + student.getId());
        final String getByIdResult = OkhttpUtils.get(hostUrl + "/hlw/studentso/get-by-id?id=" + student.getId());
        log.info("获取单个学生信息的返回值为：" + getByIdResult);

        log.info("删除学生信息的参数为：" + student.getId());
        final String deleteResult = OkhttpUtils.delete(hostUrl + "/hlw/student?id=" + student.getId());
        log.info("删除学生信息的返回值为：" + deleteResult);
        final Ro deleteRo = _objectMapper.readValue(deleteResult, Ro.class);
        log.info(deleteRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, deleteRo.getResult());
    }

    private HlwStudentMo addStudent(final String studentCode) throws IOException, JsonParseException, JsonMappingException {
        final HlwStudentMo mo = new HlwStudentMo();
        mo.setStudentCode(studentCode);
        mo.setName(RandomEx.randomChineseName());
        mo.setPhone1(RandomEx.randomMobile());
        mo.setPhone2(RandomEx.randomMobile());
        mo.setIdCard(RandomEx.randomIdCard());
        mo.setAge((byte) (RandomEx.getRandom().nextInt(5) + 18));
        mo.setBirthday(RandomEx.randomDate());
        mo.setSex((byte) RandomEx.getRandom().nextInt(1));
        mo.setHeight(BigDecimal.valueOf(RandomEx.getRandom().nextInt(30) / 100 + 1.5));
        mo.setWeight(BigDecimal.valueOf(RandomEx.getRandom().nextInt(30) / 100 + 50));
        mo.setIsCpc(RandomEx.randomBoolean());
        mo.setRegTime(RandomEx.randomDate());

        log.info("添加学生信息的参数为：" + mo);
        final String addResult = OkhttpUtils.postByJsonParams(hostUrl + "/hlw/student", mo);
        log.info("添加学生信息的返回值为：" + addResult);
        final IdRo idRo = _objectMapper.readValue(addResult, IdRo.class);
        log.info(idRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
        mo.setId(Long.valueOf(idRo.getId()));
        return mo;
    }
}
