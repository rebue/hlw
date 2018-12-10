package rebue.hlw.svc;

import java.util.List;
import rebue.hlw.dic.SexDic;
import rebue.hlw.mo.HlwStudentMo;
import rebue.robotech.svc.MybatisBaseSvc;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
public interface HlwStudentSvc extends MybatisBaseSvc<HlwStudentMo, java.lang.Long> {

    /**
     * 通过性别获取学生信息列表
     */
    List<HlwStudentMo> listBySex(SexDic sex);
}
