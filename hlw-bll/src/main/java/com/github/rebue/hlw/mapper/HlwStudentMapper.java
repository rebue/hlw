package com.github.rebue.hlw.mapper;

import com.github.rebue.hlw.mo.HlwStudentMo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface HlwStudentMapper extends MybatisBaseMapper<HlwStudentMo, Long> {
    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    HlwStudentMo selectByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HlwStudentMo> selectAll();

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HlwStudentMo> selectSelective(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(HlwStudentMo record);

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(HlwStudentMo record);
}