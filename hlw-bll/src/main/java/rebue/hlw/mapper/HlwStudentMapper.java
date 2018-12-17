package rebue.hlw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import rebue.hlw.dic.SexDic;
import rebue.hlw.mo.HlwStudentMo;
import rebue.robotech.mapper.MybatisBaseMapper;

@Mapper
public interface HlwStudentMapper extends MybatisBaseMapper<HlwStudentMo, Long> {

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int deleteByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insert(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int insertSelective(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    HlwStudentMo selectByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKeySelective(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int updateByPrimaryKey(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HlwStudentMo> selectAll();

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    List<HlwStudentMo> selectSelective(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existByPrimaryKey(Long id);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    boolean existSelective(HlwStudentMo record);

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    int countSelective(HlwStudentMo record);

    /**
     * 通过性别获取学生信息列表
     */
    List<HlwStudentMo> listBySex(SexDic sex);
}
