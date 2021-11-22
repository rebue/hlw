package com.github.rebue.hlw.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Data
@JsonInclude(Include.NON_NULL)
public class HlwStudentDelTo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    * 学号
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @Length(max = 20, message = "学号的长度不能大于20")
    private String            studentCode;
    /**
    * 姓名
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @Length(max = 100, message = "姓名的长度不能大于100")
    private String            name;
    /**
    * 电话号码1
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @Length(max = 20, message = "电话号码1的长度不能大于20")
    private String            phone1;
    /**
    * 电话号码2
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @Length(max = 20, message = "电话号码2的长度不能大于20")
    private String            phone2;
    /**
    * 身份证号码
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @Length(max = 18, message = "身份证号码的长度不能大于18")
    private String            idCard;
    /**
    * 年龄
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @PositiveOrZero(message = "年龄不能为负数")
    private Byte              age;
    /**
    * 生日
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate         birthday;
    /**
    * 性别
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @PositiveOrZero(message = "性别不能为负数")
    private Byte              sex;
    /**
    * 身高
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @PositiveOrZero(message = "身高不能为负数")
    private BigDecimal        height;
    /**
    * 体重
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @PositiveOrZero(message = "体重不能为负数")
    private BigDecimal        weight;
    /**
    * 是否党员
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Boolean           isCpc;
    /**
    * 注册时间
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime     regDatetime;
    /**
    * 每天沟通时间
    *
    * @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "GMT+8")
    private LocalTime         communicateTime;

}