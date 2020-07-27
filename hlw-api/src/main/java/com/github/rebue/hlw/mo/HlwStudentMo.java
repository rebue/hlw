package com.github.rebue.hlw.mo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import rebue.robotech.valid.AddGroup;
import rebue.robotech.valid.ModifyGroup;

/**
 * 学生信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class HlwStudentMo implements Serializable {
    /**
     * 学生ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotNull(groups = ModifyGroup.class, message = "学生ID不能为空")
    @PositiveOrZero(message = "学生ID不能为负数")
    private Long              id;

    /**
     * 学号
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotBlank(groups = AddGroup.class, message = "学号不能为空")
    @Length(max = 20, message = "学号的长度不能大于20")
    private String            studentCode;

    /**
     * 姓名
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotBlank(groups = AddGroup.class, message = "姓名不能为空")
    @Length(max = 100, message = "姓名的长度不能大于100")
    private String            name;

    /**
     * 电话号码1
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotBlank(groups = AddGroup.class, message = "电话号码1不能为空")
    @Length(max = 20, message = "电话号码1的长度不能大于20")
    private String            phone1;

    /**
     * 电话号码2
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotBlank(groups = AddGroup.class, message = "电话号码2不能为空")
    @Length(max = 20, message = "电话号码2的长度不能大于20")
    private String            phone2;

    /**
     * 身份证号码
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @NotBlank(groups = AddGroup.class, message = "身份证号码不能为空")
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

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     * 学生ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * 学号
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * 学号
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setStudentCode(final String studentCode) {
        this.studentCode = studentCode;
    }

    /**
     * 姓名
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 电话号码1
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 电话号码1
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPhone1(final String phone1) {
        this.phone1 = phone1;
    }

    /**
     * 电话号码2
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 电话号码2
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setPhone2(final String phone2) {
        this.phone2 = phone2;
    }

    /**
     * 身份证号码
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号码
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIdCard(final String idCard) {
        this.idCard = idCard;
    }

    /**
     * 年龄
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 年龄
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setAge(final Byte age) {
        this.age = age;
    }

    /**
     * 生日
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * 生日
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setBirthday(final LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * 性别
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 性别
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setSex(final Byte sex) {
        this.sex = sex;
    }

    /**
     * 身高
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * 身高
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setHeight(final BigDecimal height) {
        this.height = height;
    }

    /**
     * 体重
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * 体重
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setWeight(final BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * 是否党员
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Boolean getIsCpc() {
        return isCpc;
    }

    /**
     * 是否党员
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIsCpc(final Boolean isCpc) {
        this.isCpc = isCpc;
    }

    /**
     * 注册时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public LocalDateTime getRegDatetime() {
        return regDatetime;
    }

    /**
     * 注册时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRegDatetime(final LocalDateTime regDatetime) {
        this.regDatetime = regDatetime;
    }

    /**
     * 每天沟通时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public LocalTime getCommunicateTime() {
        return communicateTime;
    }

    /**
     * 每天沟通时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setCommunicateTime(final LocalTime communicateTime) {
        this.communicateTime = communicateTime;
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentCode=").append(studentCode);
        sb.append(", name=").append(name);
        sb.append(", phone1=").append(phone1);
        sb.append(", phone2=").append(phone2);
        sb.append(", idCard=").append(idCard);
        sb.append(", age=").append(age);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", isCpc=").append(isCpc);
        sb.append(", regDatetime=").append(regDatetime);
        sb.append(", communicateTime=").append(communicateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        final HlwStudentMo other = (HlwStudentMo) that;
        return getId() == null ? other.getId() == null : getId().equals(other.getId());
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime  = 31;
        int       result = 1;
        result = prime * result + (getId() == null ? 0 : getId().hashCode());
        return result;
    }
}