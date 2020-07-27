package com.github.rebue.hlw.api.impl;

import com.github.rebue.hlw.api.HlwStudentApi;
import com.github.rebue.hlw.jo.HlwStudentJo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.svc.HlwStudentSvc;
import org.apache.dubbo.config.annotation.DubboService;
import rebue.robotech.api.impl.BaseApiImpl;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@DubboService
public class HlwStudentApiImpl extends BaseApiImpl<java.lang.Long, HlwStudentMo, HlwStudentJo, HlwStudentSvc> implements HlwStudentApi {
}
