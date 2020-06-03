package com.github.rebue.hlw.jo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The persistent class for the HLW_STUDENT database table.
 * @mbg.generated 自动生成，如需修改，请删除本行
 */
@Entity
@Table(name = "HLW_STUDENT")
@Getter
@Setter
@ToString
public class HlwStudentJo implements Serializable {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     * 学生ID
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, length = 19)
    private Long id;

    /**
     * 学号
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "STUDENT_CODE", nullable = false, length = 20)
    private String studentCode;

    /**
     * 姓名
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    /**
     * 电话号码1
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "PHONE1", nullable = false, length = 20)
    private String phone1;

    /**
     * 电话号码2
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "PHONE2", nullable = false, length = 20)
    private String phone2;

    /**
     * 身份证号码
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = false)
    @Column(name = "ID_CARD", nullable = false, length = 18)
    private String idCard;

    /**
     * 年龄
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "AGE", nullable = true, length = 3)
    private Byte age;

    /**
     * 生日
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "BIRTHDAY", nullable = true, length = 10)
    private Date birthday;

    /**
     * 性别
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "SEX", nullable = true, length = 3)
    private Byte sex;

    /**
     * 身高
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "HEIGHT", nullable = true, precision = 3, scale = 2)
    private BigDecimal height;

    /**
     * 体重
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "WEIGHT", nullable = true, precision = 5, scale = 2)
    private BigDecimal weight;

    /**
     * 是否党员
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "IS_CPC", nullable = true, length = 1)
    private Boolean isCpc;

    /**
     * 注册时间
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Basic(optional = true)
    @Column(name = "REG_TIME", nullable = true, length = 19)
    @Temporal(TemporalType.DATE)
    private Date regTime;

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HlwStudentJo other = (HlwStudentJo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
