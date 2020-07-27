package com.github.rebue.hlw.test.http;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.github.rebue.hlw.mo.HlwStudentMo;

import lombok.extern.slf4j.Slf4j;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ra.IdRa;
import rebue.robotech.ra.PageRa;
import rebue.robotech.ra.PojoRa;
import rebue.robotech.ro.Ro;
import rebue.wheel.RandomEx;
import rebue.wheel.http.HttpClient;
import rebue.wheel.http.impl.OkHttpClientImpl;

/**
 * 学生信息 HTTP测试
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Slf4j
public class HlwStudentHttpTests {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final String       _hostUrl      = "http://127.0.0.1:9903";

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final ObjectMapper _objectMapper = // or different mapper for other format
            JsonMapper.builder().addModule(new ParameterNamesModule()).addModule(new Jdk8Module()).addModule(new JavaTimeModule()).build();

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final HttpClient   _httpClient   = new OkHttpClientImpl();

    /**
     * 测试基本的增删改查
     */
    @Test
    public void testCrud() throws IOException {
        HlwStudentMo mo = null;
        for (int i = 0; i < 20; i++) {
            mo = (HlwStudentMo) RandomEx.randomPojo(HlwStudentMo.class);
            mo.setId(null);
            log.info("添加学生信息的参数为：" + mo);
            final String addResult = _httpClient.postByJsonParams(_hostUrl + "/hlw/student", mo);
            log.info("添加学生信息的返回值为：" + addResult);
            final Ro<IdRa<Long>> idRo = _objectMapper.readValue(addResult, new TypeReference<Ro<IdRa<Long>>>() {
            });
            log.info(idRo.toString());
            Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
            mo.setId(idRo.getExtra().getId());
        }

        final HlwStudentMo errmo = (HlwStudentMo) RandomEx.randomPojo(HlwStudentMo.class);
        errmo.setId(mo.getId());
        log.info("添加学生信息的参数为：" + mo);
        String addResult = _httpClient.postByJsonParams(_hostUrl + "/hlw/student", errmo);
        log.info("添加学生信息的返回值为：" + addResult);
        Ro<?> idRo = _objectMapper.readValue(addResult, Ro.class);
        log.info(idRo.toString());
        Assertions.assertEquals(ResultDic.FAIL, idRo.getResult());
        Assertions.assertEquals("'" + errmo.getId() + "'已存在", idRo.getMsg());
        errmo.setId(null);
        errmo.setStudentCode(null);
        log.info("添加学生信息的参数为：" + mo);
        addResult = _httpClient.postByJsonParams(_hostUrl + "/hlw/student", errmo);
        log.info("添加学生信息的返回值为：" + addResult);
        idRo = _objectMapper.readValue(addResult, Ro.class);
        log.info(idRo.toString());
        Assertions.assertEquals(ResultDic.PARAM_ERROR, idRo.getResult());
        Assertions.assertEquals("学号不能为空", idRo.getMsg());
        errmo.setStudentCode(mo.getStudentCode());
        log.info("添加学生信息的参数为：" + mo);
        addResult = _httpClient.postByJsonParams(_hostUrl + "/hlw/student", errmo);
        log.info("添加学生信息的返回值为：" + addResult);
        idRo = _objectMapper.readValue(addResult, Ro.class);
        log.info(idRo.toString());
        Assertions.assertEquals(ResultDic.FAIL, idRo.getResult());
        Assertions.assertEquals("'" + errmo.getStudentCode() + "'已存在", idRo.getMsg());

        final String listResult = _httpClient.get(_hostUrl + "/hlw/student/list?pageNum=1&pageSize=5");
        log.info("查询学生信息的返回值为：" + listResult);
        final Ro<PageRa<HlwStudentMo>> listRo = _objectMapper.readValue(listResult, new TypeReference<Ro<PageRa<HlwStudentMo>>>() {
        });
        Assertions.assertEquals(ResultDic.SUCCESS, listRo.getResult());
        log.info("获取单个学生信息的参数为：" + mo.getId());
        final String getByIdResult = _httpClient.get(_hostUrl + "/hlw/student/get-by-id?id=" + mo.getId());
        log.info("获取单个学生信息的返回值为：" + getByIdResult);
        final Ro<PojoRa<HlwStudentMo>> getByIdRo = _objectMapper.readValue(getByIdResult, new TypeReference<Ro<PojoRa<HlwStudentMo>>>() {
        });
        Assertions.assertEquals(ResultDic.SUCCESS, getByIdRo.getResult());
        mo = getByIdRo.getExtra().getOne();
        log.info("修改学生信息的参数为：" + mo);
        String modifyResult = _httpClient.putByJsonParams(_hostUrl + "/hlw/student", mo);
        log.info("修改学生信息的返回值为：" + modifyResult);
        Ro<?> modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());
        mo.setStudentCode("abcdefg123456789012345");
        log.info("修改学生信息的参数为：" + mo);
        modifyResult = _httpClient.putByJsonParams(_hostUrl + "/hlw/student", mo);
        log.info("修改学生信息的返回值为：" + modifyResult);
        modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        Assertions.assertEquals(ResultDic.PARAM_ERROR, modifyRo.getResult());
        Assertions.assertEquals("学号的长度不能大于20", modifyRo.getMsg());
        log.info("删除学生信息的参数为：" + mo.getId());
        final String deleteResult = _httpClient.delete(_hostUrl + "/hlw/student?id=" + mo.getId());
        log.info("删除学生信息的返回值为：" + deleteResult);
        final Ro<?> deleteRo = _objectMapper.readValue(deleteResult, Ro.class);
        log.info(deleteRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, deleteRo.getResult());
    }
}
