package com.github.rebue.hlw.ctrl;

import com.github.rebue.hlw.api.HlwStudentApi;
import com.github.rebue.hlw.mo.HlwStudentMo;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import rebue.robotech.ra.BooleanRa;
import rebue.robotech.ra.IdRa;
import rebue.robotech.ra.PageRa;
import rebue.robotech.ra.PojoRa;
import rebue.robotech.ro.Ro;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@RestController
public class HlwStudentCtrl {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Resource
    private HlwStudentApi api;

    /**
     * 添加学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PostMapping("/hlw/student")
    public Mono<Ro<IdRa<java.lang.Long>>> add(@RequestBody final HlwStudentMo mo) {
        return Mono.create(callback -> callback.success(api.add(mo)));
    }

    /**
     * 修改学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @PutMapping("/hlw/student")
    public Mono<Ro<?>> modify(@RequestBody final HlwStudentMo mo) {
        return Mono.create(callback -> callback.success(api.modify(mo)));
    }

    /**
     * 删除学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteMapping("/hlw/student")
    public Mono<Ro<?>> del(@RequestParam("id") final java.lang.Long id) {
        return Mono.create(callback -> callback.success(api.del(id)));
    }

    /**
     * 获取单个学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student/get-by-id")
    public Mono<Ro<PojoRa<HlwStudentMo>>> getById(@RequestParam("id") final java.lang.Long id) {
        return Mono.create(callback -> callback.success(api.getById(id)));
    }

    /**
     * 判断学生信息是否存在
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student/exist-by-id")
    public Mono<Ro<BooleanRa>> existById(@RequestParam("id") final java.lang.Long id) {
        return Mono.create(callback -> callback.success(api.existById(id)));
    }

    /**
     * 查询学生信息
     *
     * @param pageNum 查询页码
     * @param pageSize 每页大小
     * @param orderBy 排序字段
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/student/list")
    public Mono<Ro<PageRa<HlwStudentMo>>> list(final HlwStudentMo qo, @RequestParam(value = "pageNum", required = false) final Integer pageNum, @RequestParam(value = "pageSize", required = false) final Integer pageSize, @RequestParam(value = "orderBy", required = false) final String orderBy) {
        return Mono.create(callback -> callback.success(api.list(qo, pageNum, pageSize, orderBy, 100)));
    }
}
