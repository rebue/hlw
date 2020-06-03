package com.github.rebue.hlw.ctrl;

import com.github.pagehelper.PageInfo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.svc.HlwStudentSvc;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
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
    Mono<Ro> add(@RequestBody final HlwStudentMo mo) {
        log.info("received post:/hlw/student");
        return Mono.create(callback -> callback.success(svc.addWithAutoGenId(mo)));
    }

    /**
     * 修改学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/hlw/student")
    Mono<Ro> modify(@RequestBody final HlwStudentMo mo) throws Exception {
        log.info("received put:/hlw/student");
        return Mono.create(callback -> callback.success(svc.modify(mo)));
    }

    /**
     * 删除学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/hlw/student")
    Mono<Ro> del(@RequestParam("id") final java.lang.Long id) {
        log.info("received delete:/hlw/student");
        return Mono.create(callback -> callback.success(svc.del(id)));
    }

    /**
     * 获取单个学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student/get-by-id")
    Mono<HlwStudentMo> getById(@RequestParam("id") final java.lang.Long id) {
        log.info("received get:/hlw/student/get-by-id");
        return Mono.create(callback -> callback.success(svc.getById(id)));
    }

    /**
     * 查询学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student")
    Mono<PageInfo<HlwStudentMo>> list(final HlwStudentMo qo, @RequestParam(value = "pageNum", required = false) final Integer pageNum, @RequestParam(value = "pageSize", required = false) final Integer pageSize, @RequestParam(value = "orderBy", required = false) final String orderBy) {
        log.info("received get:/hlw/student");
        return Mono.create(callback -> callback.success(svc.list(qo, pageNum, pageSize, orderBy)));
    }
}
