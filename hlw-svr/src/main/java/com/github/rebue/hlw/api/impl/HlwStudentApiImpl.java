package com.github.rebue.hlw.api.impl;

import org.apache.dubbo.config.annotation.DubboService;

import com.github.rebue.hlw.api.HlwStudentApi;
import com.github.rebue.hlw.jo.HlwStudentJo;
import com.github.rebue.hlw.mo.HlwStudentMo;
import com.github.rebue.hlw.svc.HlwStudentSvc;
import com.github.rebue.hlw.to.HlwStudentAddTo;
import com.github.rebue.hlw.to.HlwStudentDelTo;
import com.github.rebue.hlw.to.HlwStudentListTo;
import com.github.rebue.hlw.to.HlwStudentModifyTo;
import com.github.rebue.hlw.to.HlwStudentOneTo;
import com.github.rebue.hlw.to.HlwStudentPageTo;

import rebue.robotech.api.impl.BaseApiImpl;

/**
 * 学生信息API实现
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@DubboService
public class HlwStudentApiImpl extends
    BaseApiImpl<java.lang.Long, HlwStudentAddTo, HlwStudentModifyTo, HlwStudentDelTo, HlwStudentOneTo, HlwStudentListTo, HlwStudentPageTo, HlwStudentMo, HlwStudentJo, HlwStudentSvc>
    implements HlwStudentApi {

}
