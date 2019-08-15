package rebue.hlw.so;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import rebue.robotech.so.So;

/**
 * XXX ElasticSearch: 搜索对象
 * 
 * @author zbz
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class HlwStudentSo extends So implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学号
     */
    private String            studentCode;

    /**
     * 姓名
     */
    private String            name;

    /**
     * 电话号码1
     */
    private String            phone1;

    /**
     * 电话号码2
     */
    private String            phone2;

    /**
     * 身份证号码
     */
    private String            idCard;

    /**
     * 年龄
     */
    private Byte              age;

    /**
     * 生日
     */
    private Date              birthday;

    /**
     * 性别
     */
    private Byte              sex;

    /**
     * 身高
     */
    private BigDecimal        height;

    /**
     * 体重
     */
    private BigDecimal        weight;

    /**
     * 是否党员
     */
    private Boolean           isCpc;

    /**
     * 注册时间
     */
    private Date              regTime;

}
