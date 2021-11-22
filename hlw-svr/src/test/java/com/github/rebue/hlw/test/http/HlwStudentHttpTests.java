package com.github.rebue.hlw.test.http;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.to.HlwStudentAddTo;
import com.github.rebue.hlw.to.HlwStudentModifyTo;

import lombok.extern.slf4j.Slf4j;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ra.IdRa;
import rebue.robotech.ra.PageRa;
import rebue.robotech.ra.PojoRa;
import rebue.robotech.ro.Ro;
import rebue.wheel.core.RandomEx;
import rebue.wheel.net.httpclient.HttpClient;
import rebue.wheel.net.httpclient.impl.OkHttpClientImpl;
import rebue.wheel.serialization.jackson.JacksonUtils;

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
    private final String     _hostUrl     = "http://127.0.0.1:9538";

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final HttpClient _httpClient  = new OkHttpClientImpl();

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Autowired
    private final Mapper     _dozerMapper = DozerBeanMapperBuilder.buildDefault();

    /**
     * 测试基本的增删改查
     * 
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void testCrud() throws IOException {
        HlwStudentAddTo addTo = null;
        Long id = null;
        for (int i = 0; i < 20; i++) {
            addTo = (HlwStudentAddTo) RandomEx.randomPojo(HlwStudentAddTo.class);
            log.info("添加学生信息的参数为：" + addTo);
            final String addResult = _httpClient.postByJsonParams(_hostUrl + "/hlw/student", addTo);
            log.info("添加学生信息的返回值为：" + addResult);
            final Ro<IdRa<Long>> idRo = JacksonUtils.deserialize(addResult, new TypeReference<Ro<IdRa<Long>>>() {
            });
            log.info(idRo.toString());
            Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
            id = idRo.getExtra().getId();
        }

        final String pageResult = _httpClient.get(_hostUrl + "/hlw/student/page");
        log.info("查询学生信息的返回值为：" + pageResult);
        final Ro<PageRa<HlwStudentMo>> pageRo = JacksonUtils.deserialize(pageResult, new TypeReference<Ro<PageRa<HlwStudentMo>>>() {
        });
        Assertions.assertEquals(ResultDic.SUCCESS, pageRo.getResult());
        log.info("获取单个学生信息的参数为：" + id);
        final String getByIdResult = _httpClient.get(_hostUrl + "/hlw/student/get-by-id?id=" + id);
        log.info("获取单个学生信息的返回值为：" + getByIdResult);

        final HlwStudentModifyTo modifyTo = _dozerMapper.map(addTo, HlwStudentModifyTo.class);
        modifyTo.setId(id);
        log.info("修改学生信息的参数为：" + modifyTo);
        final String modifyResult = _httpClient.putByJsonParams(_hostUrl + "/hlw/student", modifyTo);
        final Ro<PojoRa<HlwStudentMo>> getByIdRo = JacksonUtils.deserialize(getByIdResult, new TypeReference<Ro<PojoRa<HlwStudentMo>>>() {
        });
        Assertions.assertEquals(ResultDic.SUCCESS, getByIdRo.getResult());
        HlwStudentMo mo = getByIdRo.getExtra().getOne();
        mo = getByIdRo.getExtra().getOne();
        log.info("修改学生信息的返回值为：" + modifyResult);
        final Ro<?> modifyRo = JacksonUtils.deserialize(modifyResult, Ro.class);
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());

        log.info("删除学生信息的参数为：" + mo.getId());
        final String deleteResult = _httpClient.delete(_hostUrl + "/hlw/student?id=" + mo.getId());
        log.info("删除学生信息的返回值为：" + deleteResult);
        final Ro<?> deleteRo = JacksonUtils.deserialize(deleteResult, Ro.class);
        log.info(deleteRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, deleteRo.getResult());
    }
}
