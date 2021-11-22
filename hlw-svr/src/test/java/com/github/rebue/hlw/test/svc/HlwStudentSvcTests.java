package com.github.rebue.hlw.test.svc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.dozermapper.core.Mapper;
import com.github.pagehelper.PageInfo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.svc.HlwStudentSvc;
import com.github.rebue.hlw.to.HlwStudentAddTo;
import com.github.rebue.hlw.to.HlwStudentModifyTo;
import com.github.rebue.hlw.to.HlwStudentPageTo;

import lombok.extern.slf4j.Slf4j;
import rebue.wheel.core.RandomEx;

/**
 * 学生信息 Service层测试
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Slf4j
@SpringBootTest
public class HlwStudentSvcTests {

    /**
     * 要测试的微服务
     * 
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Autowired
    private HlwStudentSvc _svc;

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Autowired
    private Mapper        dozerMapper;

    /**
     * 测试基本的增删改查
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void testCrud() {
        HlwStudentAddTo addTo = null;
        Long id = null;
        for (int i = 0; i < 20; i++) {
            addTo = (HlwStudentAddTo) RandomEx.randomPojo(HlwStudentAddTo.class);
            log.info("添加学生信息的参数为：" + addTo);
            final HlwStudentMo addRo = _svc.add(addTo);
            log.info("添加学生信息的返回值为：" + addRo);
            Assertions.assertNotNull(addRo);
            id = addRo.getId();
        }
        final PageInfo<HlwStudentMo> pageResult = _svc.page(new HlwStudentPageTo());
        log.info("查询学生信息的返回值为：" + pageResult);
        Assertions.assertNotNull(pageResult);
        log.info("获取单个学生信息的参数为：" + id);
        HlwStudentMo getByIdResult = _svc.getById(id);
        log.info("获取单个学生信息的返回值为：" + getByIdResult);
        Assertions.assertNotNull(getByIdResult);

        final HlwStudentModifyTo modifyTo = dozerMapper.map(addTo, HlwStudentModifyTo.class);
        modifyTo.setId(id);
        log.info("修改学生信息的参数为：" + modifyTo);
        _svc.modifyById(modifyTo);

        log.info("删除学生信息的参数为：" + id);
        _svc.delById(id);
    }
}
