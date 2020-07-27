package com.github.rebue.hlw.test.api;

import com.github.rebue.hlw.api.HlwStudentApi;
import com.github.rebue.hlw.mo.HlwStudentMo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ra.IdRa;
import rebue.robotech.ra.PageRa;
import rebue.robotech.ra.PojoRa;
import rebue.robotech.ro.Ro;
import rebue.wheel.RandomEx;

/**
 * 学生信息 API层测试
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Slf4j
@SpringBootTest
public class HlwStudentApiTests {

    /**
     * 要测试的微服务
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DubboReference
    private HlwStudentApi _api;

    /**
     * 测试基本的增删改查
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void testCrud() {
        HlwStudentMo mo = null;
        for (int i = 0; i < 20; i++) {
            mo = (HlwStudentMo) RandomEx.randomPojo(HlwStudentMo.class);
            mo.setId(null);
            log.info("添加学生信息的参数为：" + mo);
            final Ro<IdRa<Long>> idRo = _api.add(mo);
            log.info("添加学生信息的返回值为：" + idRo);
            Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
            mo.setId(idRo.getExtra().getId());
        }
        final Ro<PageRa<HlwStudentMo>> listResult = _api.list(null, 1, 5, null, 10);
        log.info("查询学生信息的返回值为：" + listResult);
        Assertions.assertEquals(ResultDic.SUCCESS, listResult.getResult());
        log.info("获取单个学生信息的参数为：" + mo.getId());
        final Ro<PojoRa<HlwStudentMo>> getByIdResult = _api.getById(mo.getId());
        log.info("获取单个学生信息的返回值为：" + getByIdResult);
        log.info("修改学生信息的参数为：" + mo);
        final Ro<?> modifyResult = _api.modify(mo);
        log.info("修改学生信息的返回值为：" + modifyResult);
        Assertions.assertEquals(ResultDic.SUCCESS, modifyResult.getResult());
        log.info("删除学生信息的参数为：" + mo.getId());
        final Ro<?> deleteResult = _api.del(mo.getId());
        log.info("删除学生信息的返回值为：" + deleteResult);
        Assertions.assertEquals(ResultDic.SUCCESS, deleteResult.getResult());
    }
}
