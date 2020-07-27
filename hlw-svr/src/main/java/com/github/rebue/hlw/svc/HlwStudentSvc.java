package com.github.rebue.hlw.svc;

import com.github.rebue.hlw.jo.HlwStudentJo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import org.springframework.validation.annotation.Validated;
import rebue.robotech.svc.BaseSvc;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
// @Validated注解按规范应该写在接口上；@Valid注解在参数是POJO类时写在参数类型的前面，具体约束的注解写在参数类型的属性的上方；而普通参数则写在方法的上方，具体约束的注解直接写在参数类型的前面
@Validated
public interface HlwStudentSvc extends BaseSvc<java.lang.Long, HlwStudentMo, HlwStudentJo> {
}
