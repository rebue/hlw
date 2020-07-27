package com.github.rebue.hlw.api;

import com.github.rebue.hlw.mo.HlwStudentMo;
import org.springframework.validation.annotation.Validated;
import rebue.robotech.api.BaseApi;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
// 在接口上方必须写上 @Validated 注解；
// 有分组时，在方法上方必须写上 @Validated 注解及分组；
// 参数是POJO类时用 @Valid 注解在参数类型的前面进行修饰；
// 而如果是普通参数，则在方法的上方写上 @Validated 注解，具体约束的注解直接写在参数类型的前面
@Validated
public interface HlwStudentApi extends BaseApi<java.lang.Long, HlwStudentMo> {
}
