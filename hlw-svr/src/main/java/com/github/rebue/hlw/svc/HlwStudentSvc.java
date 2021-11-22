package com.github.rebue.hlw.svc;

import org.springframework.validation.annotation.Validated;

import com.github.rebue.hlw.jo.HlwStudentJo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.to.HlwStudentAddTo;
import com.github.rebue.hlw.to.HlwStudentDelTo;
import com.github.rebue.hlw.to.HlwStudentListTo;
import com.github.rebue.hlw.to.HlwStudentModifyTo;
import com.github.rebue.hlw.to.HlwStudentOneTo;
import com.github.rebue.hlw.to.HlwStudentPageTo;

import rebue.robotech.svc.BaseSvc;

/**
 * 学生信息服务接口
 *
 * <pre>
 * 1. 在接口上方必须写上 @Validated 注解
 * 2. 参数是POJO类时用 @Valid 注解在参数类型的前面进行修饰
 *    参数是普通参数时，直接在参数类型的前面加上具体约束的注解
 * 3. (待验证)有分组时，在方法上方必须写上 @Validated 注解及分组
 * 4. 踩坑留痕：
 *    如果方法的返回值为void，在方法上方加上 @Valid 注解会出现异常，报HV000132错误
 * </pre>
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Validated
public interface HlwStudentSvc
    extends BaseSvc<java.lang.Long, HlwStudentAddTo, HlwStudentModifyTo, HlwStudentDelTo, HlwStudentOneTo, HlwStudentListTo, HlwStudentPageTo, HlwStudentMo, HlwStudentJo> {

}