package com.github.rebue.hlw.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
学生信息

数据库表: HLW_STUDENT

@mbg.generated 自动生成的注释，如需修改本注释，请删除本行
*/
@JsonInclude(Include.NON_NULL)
public class HlwStudentMo implements Serializable {
    /**
    学生ID
    
    数据库字段: HLW_STUDENT.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long id;

    /**
    学号
    
    数据库字段: HLW_STUDENT.STUDENT_CODE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String studentCode;

    /**
    姓名
    
    数据库字段: HLW_STUDENT.NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String name;

    /**
    电话号码1
    
    数据库字段: HLW_STUDENT.PHONE1
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String phone1;

    /**
    电话号码2
    
    数据库字段: HLW_STUDENT.PHONE2
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String phone2;

    /**
    身份证号码
    
    数据库字段: HLW_STUDENT.ID_CARD
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String idCard;

    /**
    年龄
    
    数据库字段: HLW_STUDENT.AGE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Byte age;

    /**
    生日
    
    数据库字段: HLW_STUDENT.BIRTHDAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;

    /**
    性别
    
    数据库字段: HLW_STUDENT.SEX
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Byte sex;

    /**
    身高
    
    数据库字段: HLW_STUDENT.HEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private BigDecimal height;

    /**
    体重
    
    数据库字段: HLW_STUDENT.WEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private BigDecimal weight;

    /**
    是否党员
    
    数据库字段: HLW_STUDENT.IS_CPC
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Boolean isCpc;

    /**
    注册时间
    
    数据库字段: HLW_STUDENT.REG_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date regTime;

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    学生ID
    
    数据库字段: HLW_STUDENT.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getId() {
        return id;
    }

    /**
    学生ID
    
    数据库字段: HLW_STUDENT.ID
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    学号
    
    数据库字段: HLW_STUDENT.STUDENT_CODE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getStudentCode() {
        return studentCode;
    }

    /**
    学号
    
    数据库字段: HLW_STUDENT.STUDENT_CODE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    /**
    姓名
    
    数据库字段: HLW_STUDENT.NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getName() {
        return name;
    }

    /**
    姓名
    
    数据库字段: HLW_STUDENT.NAME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    电话号码1
    
    数据库字段: HLW_STUDENT.PHONE1
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getPhone1() {
        return phone1;
    }

    /**
    电话号码1
    
    数据库字段: HLW_STUDENT.PHONE1
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    /**
    电话号码2
    
    数据库字段: HLW_STUDENT.PHONE2
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getPhone2() {
        return phone2;
    }

    /**
    电话号码2
    
    数据库字段: HLW_STUDENT.PHONE2
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    /**
    身份证号码
    
    数据库字段: HLW_STUDENT.ID_CARD
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getIdCard() {
        return idCard;
    }

    /**
    身份证号码
    
    数据库字段: HLW_STUDENT.ID_CARD
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
    年龄
    
    数据库字段: HLW_STUDENT.AGE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Byte getAge() {
        return age;
    }

    /**
    年龄
    
    数据库字段: HLW_STUDENT.AGE
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
    生日
    
    数据库字段: HLW_STUDENT.BIRTHDAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Date getBirthday() {
        return birthday;
    }

    /**
    生日
    
    数据库字段: HLW_STUDENT.BIRTHDAY
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
    性别
    
    数据库字段: HLW_STUDENT.SEX
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Byte getSex() {
        return sex;
    }

    /**
    性别
    
    数据库字段: HLW_STUDENT.SEX
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
    身高
    
    数据库字段: HLW_STUDENT.HEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public BigDecimal getHeight() {
        return height;
    }

    /**
    身高
    
    数据库字段: HLW_STUDENT.HEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
    体重
    
    数据库字段: HLW_STUDENT.WEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
    体重
    
    数据库字段: HLW_STUDENT.WEIGHT
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
    是否党员
    
    数据库字段: HLW_STUDENT.IS_CPC
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Boolean getIsCpc() {
        return isCpc;
    }

    /**
    是否党员
    
    数据库字段: HLW_STUDENT.IS_CPC
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setIsCpc(Boolean isCpc) {
        this.isCpc = isCpc;
    }

    /**
    注册时间
    
    数据库字段: HLW_STUDENT.REG_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Date getRegTime() {
        return regTime;
    }

    /**
    注册时间
    
    数据库字段: HLW_STUDENT.REG_TIME
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        sb.append(", regTime=").append(regTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HlwStudentMo other = (HlwStudentMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}