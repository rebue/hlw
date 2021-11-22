package com.github.rebue.hlw.mapper;

import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.age;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.birthday;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.communicateTime;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.height;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.hlwStudent;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.id;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.idCard;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.isCpc;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.name;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.phone1;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.phone2;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.regDatetime;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.sex;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.studentCode;
import static com.github.rebue.hlw.mapper.HlwStudentDynamicSqlSupport.weight;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualToWhenPresent;
import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import com.github.rebue.hlw.mo.HlwStudentMo;

import rebue.robotech.mybatis.MapperRootInterface;

@Mapper
public interface HlwStudentMapper extends MapperRootInterface<HlwStudentMo, Long> {
    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    BasicColumn[] selectList = BasicColumn.columnList(id, studentCode, name, phone1, phone2, idCard, age, birthday, sex, height, weight, isCpc, regDatetime, communicateTime);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<HlwStudentMo> insertStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<HlwStudentMo> multipleInsertStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HlwStudentMoResult")
    Optional<HlwStudentMo> selectOne(SelectStatementProvider selectStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HlwStudentMoResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="STUDENT_CODE", property="studentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE1", property="phone1", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE2", property="phone2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ID_CARD", property="idCard", jdbcType=JdbcType.CHAR),
        @Result(column="AGE", property="age", jdbcType=JdbcType.TINYINT),
        @Result(column="BIRTHDAY", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.TINYINT),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.DECIMAL),
        @Result(column="WEIGHT", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="IS_CPC", property="isCpc", jdbcType=JdbcType.BIT),
        @Result(column="REG_DATETIME", property="regDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="COMMUNICATE_TIME", property="communicateTime", jdbcType=JdbcType.TIME)
    })
    List<HlwStudentMo> selectMany(SelectStatementProvider selectStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int insert(HlwStudentMo record) {
        return MyBatis3Utils.insert(this::insert, record, hlwStudent, c ->
            c.map(id).toProperty("id")
            .map(studentCode).toProperty("studentCode")
            .map(name).toProperty("name")
            .map(phone1).toProperty("phone1")
            .map(phone2).toProperty("phone2")
            .map(idCard).toProperty("idCard")
            .map(age).toProperty("age")
            .map(birthday).toProperty("birthday")
            .map(sex).toProperty("sex")
            .map(height).toProperty("height")
            .map(weight).toProperty("weight")
            .map(isCpc).toProperty("isCpc")
            .map(regDatetime).toProperty("regDatetime")
            .map(communicateTime).toProperty("communicateTime")
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int insertMultiple(Collection<HlwStudentMo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, hlwStudent, c ->
            c.map(id).toProperty("id")
            .map(studentCode).toProperty("studentCode")
            .map(name).toProperty("name")
            .map(phone1).toProperty("phone1")
            .map(phone2).toProperty("phone2")
            .map(idCard).toProperty("idCard")
            .map(age).toProperty("age")
            .map(birthday).toProperty("birthday")
            .map(sex).toProperty("sex")
            .map(height).toProperty("height")
            .map(weight).toProperty("weight")
            .map(isCpc).toProperty("isCpc")
            .map(regDatetime).toProperty("regDatetime")
            .map(communicateTime).toProperty("communicateTime")
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int insertSelective(HlwStudentMo record) {
        return MyBatis3Utils.insert(this::insert, record, hlwStudent, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(studentCode).toPropertyWhenPresent("studentCode", record::getStudentCode)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(phone1).toPropertyWhenPresent("phone1", record::getPhone1)
            .map(phone2).toPropertyWhenPresent("phone2", record::getPhone2)
            .map(idCard).toPropertyWhenPresent("idCard", record::getIdCard)
            .map(age).toPropertyWhenPresent("age", record::getAge)
            .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(height).toPropertyWhenPresent("height", record::getHeight)
            .map(weight).toPropertyWhenPresent("weight", record::getWeight)
            .map(isCpc).toPropertyWhenPresent("isCpc", record::getIsCpc)
            .map(regDatetime).toPropertyWhenPresent("regDatetime", record::getRegDatetime)
            .map(communicateTime).toPropertyWhenPresent("communicateTime", record::getCommunicateTime)
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default Optional<HlwStudentMo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default List<HlwStudentMo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default List<HlwStudentMo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default Optional<HlwStudentMo> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, hlwStudent, completer);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    static UpdateDSL<UpdateModel> updateAllColumns(HlwStudentMo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(studentCode).equalTo(record::getStudentCode)
                .set(name).equalTo(record::getName)
                .set(phone1).equalTo(record::getPhone1)
                .set(phone2).equalTo(record::getPhone2)
                .set(idCard).equalTo(record::getIdCard)
                .set(age).equalTo(record::getAge)
                .set(birthday).equalTo(record::getBirthday)
                .set(sex).equalTo(record::getSex)
                .set(height).equalTo(record::getHeight)
                .set(weight).equalTo(record::getWeight)
                .set(isCpc).equalTo(record::getIsCpc)
                .set(regDatetime).equalTo(record::getRegDatetime)
                .set(communicateTime).equalTo(record::getCommunicateTime);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    static UpdateDSL<UpdateModel> updateSelectiveColumns(HlwStudentMo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(studentCode).equalToWhenPresent(record::getStudentCode)
                .set(name).equalToWhenPresent(record::getName)
                .set(phone1).equalToWhenPresent(record::getPhone1)
                .set(phone2).equalToWhenPresent(record::getPhone2)
                .set(idCard).equalToWhenPresent(record::getIdCard)
                .set(age).equalToWhenPresent(record::getAge)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(height).equalToWhenPresent(record::getHeight)
                .set(weight).equalToWhenPresent(record::getWeight)
                .set(isCpc).equalToWhenPresent(record::getIsCpc)
                .set(regDatetime).equalToWhenPresent(record::getRegDatetime)
                .set(communicateTime).equalToWhenPresent(record::getCommunicateTime);
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int updateByPrimaryKey(HlwStudentMo record) {
        return update(c ->
            c.set(studentCode).equalTo(record::getStudentCode)
            .set(name).equalTo(record::getName)
            .set(phone1).equalTo(record::getPhone1)
            .set(phone2).equalTo(record::getPhone2)
            .set(idCard).equalTo(record::getIdCard)
            .set(age).equalTo(record::getAge)
            .set(birthday).equalTo(record::getBirthday)
            .set(sex).equalTo(record::getSex)
            .set(height).equalTo(record::getHeight)
            .set(weight).equalTo(record::getWeight)
            .set(isCpc).equalTo(record::getIsCpc)
            .set(regDatetime).equalTo(record::getRegDatetime)
            .set(communicateTime).equalTo(record::getCommunicateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int updateByPrimaryKeySelective(HlwStudentMo record) {
        return update(c ->
            c.set(studentCode).equalToWhenPresent(record::getStudentCode)
            .set(name).equalToWhenPresent(record::getName)
            .set(phone1).equalToWhenPresent(record::getPhone1)
            .set(phone2).equalToWhenPresent(record::getPhone2)
            .set(idCard).equalToWhenPresent(record::getIdCard)
            .set(age).equalToWhenPresent(record::getAge)
            .set(birthday).equalToWhenPresent(record::getBirthday)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(height).equalToWhenPresent(record::getHeight)
            .set(weight).equalToWhenPresent(record::getWeight)
            .set(isCpc).equalToWhenPresent(record::getIsCpc)
            .set(regDatetime).equalToWhenPresent(record::getRegDatetime)
            .set(communicateTime).equalToWhenPresent(record::getCommunicateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default BasicColumn[] getColumns() {
        return selectList;
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default int deleteSelective(HlwStudentMo record) {
        return delete(c ->
            c.where(id, isEqualToWhenPresent(record::getId))
            .and(studentCode, isEqualToWhenPresent(record::getStudentCode))
            .and(name, isEqualToWhenPresent(record::getName))
            .and(phone1, isEqualToWhenPresent(record::getPhone1))
            .and(phone2, isEqualToWhenPresent(record::getPhone2))
            .and(idCard, isEqualToWhenPresent(record::getIdCard))
            .and(age, isEqualToWhenPresent(record::getAge))
            .and(birthday, isEqualToWhenPresent(record::getBirthday))
            .and(sex, isEqualToWhenPresent(record::getSex))
            .and(height, isEqualToWhenPresent(record::getHeight))
            .and(weight, isEqualToWhenPresent(record::getWeight))
            .and(isCpc, isEqualToWhenPresent(record::getIsCpc))
            .and(regDatetime, isEqualToWhenPresent(record::getRegDatetime))
            .and(communicateTime, isEqualToWhenPresent(record::getCommunicateTime))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default Optional<HlwStudentMo> selectOne(HlwStudentMo record) {
        return selectOne(c ->
            c.where(id, isEqualToWhenPresent(record::getId))
            .and(studentCode, isEqualToWhenPresent(record::getStudentCode))
            .and(name, isEqualToWhenPresent(record::getName))
            .and(phone1, isEqualToWhenPresent(record::getPhone1))
            .and(phone2, isEqualToWhenPresent(record::getPhone2))
            .and(idCard, isEqualToWhenPresent(record::getIdCard))
            .and(age, isEqualToWhenPresent(record::getAge))
            .and(birthday, isEqualToWhenPresent(record::getBirthday))
            .and(sex, isEqualToWhenPresent(record::getSex))
            .and(height, isEqualToWhenPresent(record::getHeight))
            .and(weight, isEqualToWhenPresent(record::getWeight))
            .and(isCpc, isEqualToWhenPresent(record::getIsCpc))
            .and(regDatetime, isEqualToWhenPresent(record::getRegDatetime))
            .and(communicateTime, isEqualToWhenPresent(record::getCommunicateTime))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default long countSelective(HlwStudentMo record) {
        return count(c ->
            c.where(id, isEqualToWhenPresent(record::getId))
            .and(studentCode, isEqualToWhenPresent(record::getStudentCode))
            .and(name, isEqualToWhenPresent(record::getName))
            .and(phone1, isEqualToWhenPresent(record::getPhone1))
            .and(phone2, isEqualToWhenPresent(record::getPhone2))
            .and(idCard, isEqualToWhenPresent(record::getIdCard))
            .and(age, isEqualToWhenPresent(record::getAge))
            .and(birthday, isEqualToWhenPresent(record::getBirthday))
            .and(sex, isEqualToWhenPresent(record::getSex))
            .and(height, isEqualToWhenPresent(record::getHeight))
            .and(weight, isEqualToWhenPresent(record::getWeight))
            .and(isCpc, isEqualToWhenPresent(record::getIsCpc))
            .and(regDatetime, isEqualToWhenPresent(record::getRegDatetime))
            .and(communicateTime, isEqualToWhenPresent(record::getCommunicateTime))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default boolean existByPrimaryKey(Long id_) {
        return count(c -> c.where(id, isEqualTo(id_))) > 0;
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default boolean existSelective(HlwStudentMo record) {
        return countSelective(record) > 0;
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default List<HlwStudentMo> selectSelective(HlwStudentMo record) {
        return select(c ->
            c.where(id, isEqualToWhenPresent(record::getId))
            .and(studentCode, isEqualToWhenPresent(record::getStudentCode))
            .and(name, isEqualToWhenPresent(record::getName))
            .and(phone1, isEqualToWhenPresent(record::getPhone1))
            .and(phone2, isEqualToWhenPresent(record::getPhone2))
            .and(idCard, isEqualToWhenPresent(record::getIdCard))
            .and(age, isEqualToWhenPresent(record::getAge))
            .and(birthday, isEqualToWhenPresent(record::getBirthday))
            .and(sex, isEqualToWhenPresent(record::getSex))
            .and(height, isEqualToWhenPresent(record::getHeight))
            .and(weight, isEqualToWhenPresent(record::getWeight))
            .and(isCpc, isEqualToWhenPresent(record::getIsCpc))
            .and(regDatetime, isEqualToWhenPresent(record::getRegDatetime))
            .and(communicateTime, isEqualToWhenPresent(record::getCommunicateTime))
        );
    }

    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    default List<HlwStudentMo> selectIn(List<Long> ids) {
        return select(c -> c.where(id, isIn(ids)));
    }
}