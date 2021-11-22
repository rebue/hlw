package com.github.rebue.hlw.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HlwStudentDynamicSqlSupport {
    /**
    * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public static final HlwStudent hlwStudent = new HlwStudent();

    /**
    * 学生ID
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<Long> id = hlwStudent.id;

    /**
    * 学号
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<String> studentCode = hlwStudent.studentCode;

    /**
    * 姓名
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<String> name = hlwStudent.name;

    /**
    * 电话号码1
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<String> phone1 = hlwStudent.phone1;

    /**
    * 电话号码2
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<String> phone2 = hlwStudent.phone2;

    /**
    * 身份证号码
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<String> idCard = hlwStudent.idCard;

    /**
    * 年龄
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<Byte> age = hlwStudent.age;

    /**
    * 生日
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<LocalDate> birthday = hlwStudent.birthday;

    /**
    * 性别
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<Byte> sex = hlwStudent.sex;

    /**
    * 身高
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<BigDecimal> height = hlwStudent.height;

    /**
    * 体重
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<BigDecimal> weight = hlwStudent.weight;

    /**
    * 是否党员
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<Boolean> isCpc = hlwStudent.isCpc;

    /**
    * 注册时间
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<LocalDateTime> regDatetime = hlwStudent.regDatetime;

    /**
    * 每天沟通时间
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    public static final SqlColumn<LocalTime> communicateTime = hlwStudent.communicateTime;

    public static final class HlwStudent extends SqlTable {
        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<String> studentCode = column("STUDENT_CODE", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> phone1 = column("PHONE1", JDBCType.VARCHAR);

        public final SqlColumn<String> phone2 = column("PHONE2", JDBCType.VARCHAR);

        public final SqlColumn<String> idCard = column("ID_CARD", JDBCType.CHAR);

        public final SqlColumn<Byte> age = column("AGE", JDBCType.TINYINT);

        public final SqlColumn<LocalDate> birthday = column("BIRTHDAY", JDBCType.DATE);

        public final SqlColumn<Byte> sex = column("SEX", JDBCType.TINYINT);

        public final SqlColumn<BigDecimal> height = column("HEIGHT", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> weight = column("WEIGHT", JDBCType.DECIMAL);

        public final SqlColumn<Boolean> isCpc = column("IS_CPC", JDBCType.BIT);

        public final SqlColumn<LocalDateTime> regDatetime = column("REG_DATETIME", JDBCType.TIMESTAMP);

        public final SqlColumn<LocalTime> communicateTime = column("COMMUNICATE_TIME", JDBCType.TIME);

        public HlwStudent() {
            super("HLW_STUDENT");
        }
    }
}