package com.github.rebue.hlw.ctrl;

import com.github.pagehelper.PageInfo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.svc.HlwStudentSvc;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.IdRo;
import rebue.robotech.ro.Ro;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
@Slf4j
public class HlwStudentCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private HlwStudentSvc svc;

    /**
     * 添加学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/hlw/student")
    IdRo add(@RequestBody final HlwStudentMo mo) throws Exception {
        log.info("received post:/hlw/student");
        log.info("studentCtrl.add: {}", mo);
        final IdRo ro = new IdRo();
        try {
            final int result = svc.add(mo);
            if (result == 1) {
                final String msg = "添加成功";
                log.info("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.SUCCESS);
                ro.setId(mo.getId().toString());
                return ro;
            } else {
                final String msg = "添加失败";
                log.error("{}: mo-{}", msg, mo);
                ro.setMsg(msg);
                ro.setResult(ResultDic.FAIL);
                return ro;
            }
        } catch (final DuplicateKeyException e) {
            final String msg = "添加失败，唯一键重复：" + e.getCause().getMessage();
            log.error(msg + ": mo-" + mo, e);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        } catch (final RuntimeException e) {
            final String msg = "添加失败，出现运行时异常";
            log.error(msg + ": mo-" + mo, e);
            ro.setMsg(msg);
            ro.setResult(ResultDic.FAIL);
            return ro;
        }
    }

    /**
     * 修改学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/hlw/student")
    Ro modify(@RequestBody final HlwStudentMo mo) throws Exception {
        log.info("received put:/hlw/student");
        log.info("studentCtrl.modify: {}", mo);
        try {
            if (svc.modify(mo) == 1) {
                final String msg = "修改成功";
                log.info("{}: mo-{}", msg, mo);
                return new Ro(ResultDic.SUCCESS, msg);
            } else {
                final String msg = "修改失败";
                log.error("{}: mo-{}", msg, mo);
                return new Ro(ResultDic.FAIL, msg);
            }
        } catch (final DuplicateKeyException e) {
            final String msg = "修改失败，唯一键重复：" + e.getCause().getMessage();
            log.error(msg + ": mo=" + mo, e);
            return new Ro(ResultDic.FAIL, msg);
        } catch (final RuntimeException e) {
            final String msg = "修改失败，出现运行时异常";
            log.error(msg + ": mo-" + mo, e);
            return new Ro(ResultDic.FAIL, msg);
        }
    }

    /**
     * 删除学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/hlw/student")
    Ro del(@RequestParam("id") final java.lang.Long id) {
        log.info("received delete:/hlw/student");
        log.info("studentCtrl.del: {}", id);
        final int result = svc.del(id);
        if (result == 1) {
            final String msg = "删除成功";
            log.info("{}: id-{}", msg, id);
            return new Ro(ResultDic.SUCCESS, msg);
        } else {
            final String msg = "删除失败，找不到该记录";
            log.error("{}: id-{}", msg, id);
            return new Ro(ResultDic.FAIL, msg);
        }
    }

    /**
     * 查询学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student")
    PageInfo<HlwStudentMo> list(final HlwStudentMo mo, @RequestParam(value = "pageNum", required = false) Integer pageNum, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        log.info("received get:/hlw/student");
        log.info("studentCtrl.list: {},pageNum-{},pageSize-{}", mo, pageNum, pageSize);
        if (pageNum == null) {
            pageNum = 1;
        }
        if (pageSize == null) {
            pageSize = 5;
        }
        log.info("list HlwStudentMo:" + mo + ", pageNum = " + pageNum + ", pageSize = " + pageSize);
        if (pageSize > 50) {
            final String msg = "pageSize不能大于50";
            log.error(msg);
            throw new IllegalArgumentException(msg);
        }
        final PageInfo<HlwStudentMo> result = svc.list(mo, pageNum, pageSize);
        log.info("result: " + result);
        return result;
    }

    /**
     * 获取单个学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student/get-by-id")
    HlwStudentMo getById(@RequestParam("id") final java.lang.Long id) {
        log.info("received get:/hlw/student/get-by-id");
        log.info("studentCtrl.getById: {}", id);
        return svc.getById(id);
    }
}
