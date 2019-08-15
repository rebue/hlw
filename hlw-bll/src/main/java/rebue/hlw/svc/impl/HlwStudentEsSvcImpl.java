package rebue.hlw.svc.impl;

import org.springframework.stereotype.Service;

import rebue.hlw.so.HlwStudentSo;
import rebue.hlw.svc.HlwStudentEsSvc;
import rebue.robotech.svc.impl.EsBaseSvcImpl;

/**
 * 学生信息
 * XXX ElasticSearch: 服务实现类
 */
@Service
public class HlwStudentEsSvcImpl extends EsBaseSvcImpl<HlwStudentSo> implements HlwStudentEsSvc {

    @Override
    public String getIndexName() {
        return "hlw-student";
    }
}
