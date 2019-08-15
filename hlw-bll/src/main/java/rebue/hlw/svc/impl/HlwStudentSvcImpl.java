package rebue.hlw.svc.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.dozermapper.core.Mapper;

import lombok.extern.slf4j.Slf4j;
import rebue.hlw.dao.HlwStudentDao;
import rebue.hlw.jo.HlwStudentJo;
import rebue.hlw.mapper.HlwStudentMapper;
import rebue.hlw.mo.HlwStudentMo;
import rebue.hlw.so.HlwStudentSo;
import rebue.hlw.svc.HlwStudentEsSvc;
import rebue.hlw.svc.HlwStudentSvc;
import rebue.robotech.svc.impl.BaseSvcImpl;

/**
 * 学生信息
 *
 * 在单独使用不带任何参数的 @Transactional 注释时，
 * propagation(传播模式)=REQUIRED，readOnly=false，
 * isolation(事务隔离级别)=READ_COMMITTED，
 * 而且事务不会针对受控异常（checked exception）回滚。
 *
 * 注意：
 * 一般是查询的数据库操作，默认设置readOnly=true, propagation=Propagation.SUPPORTS
 * 而涉及到增删改的数据库操作的方法，要设置 readOnly=false, propagation=Propagation.REQUIRED
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
@Service
@Slf4j
public class HlwStudentSvcImpl extends BaseSvcImpl<java.lang.Long, HlwStudentJo, HlwStudentDao, HlwStudentMo, HlwStudentMapper> implements HlwStudentSvc {

    @Resource
    private HlwStudentEsSvc studentEsSvc;

    @Resource
    Mapper                  dozerMapper;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int add(final HlwStudentMo mo) {
        log.info("hlwStudentSvc.add: 添加学生信息 mo-", mo);
        // 如果id为空那么自动生成分布式id
        if (mo.getId() == null || mo.getId() == 0) {
            mo.setId(_idWorker.getId());
        }
        final int rowCount = super.add(mo);
        // XXX ElasticSearch: 添加时调用
        if (rowCount == 1) {
            studentEsSvc.add(dozerMapper.map(mo, HlwStudentSo.class));
        }
        return rowCount;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int modify(final HlwStudentMo mo) {
        final int rowCount = super.modify(mo);
        // XXX ElasticSearch: 修改时调用
        if (rowCount == 1) {
            studentEsSvc.add(dozerMapper.map(mo, HlwStudentSo.class));
        }
        return rowCount;
    }

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public int del(final Long id) {
        final int rowCount = super.del(id);
        // XXX ElasticSearch: 删除时调用
        if (rowCount == 1) {
            studentEsSvc.del(id.toString());
        }
        return rowCount;
    }

}
