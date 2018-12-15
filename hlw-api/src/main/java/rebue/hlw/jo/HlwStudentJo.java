package rebue.hlw.jo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the HLW_STUDENT database table.
 * 
 */
@Entity
@Table(name="HLW_STUDENT")
@NamedQuery(name="HlwStudentJo.findAll", query="SELECT h FROM HlwStudentJo h")
public class HlwStudentJo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private Long id;

	@Column(name="AGE")
	private byte age;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTHDAY")
	private Date birthday;

	@Column(name="HEIGHT", precision=10, scale=2)
	private BigDecimal height;

	@Column(name="ID_CARD", nullable=false, length=18)
	private String idCard;

	@Column(name="IS_CPC")
	private Boolean isCpc;

	@Column(name="NAME", nullable=false, length=100)
	private String name;

	@Column(name="PHONE1", nullable=false, length=20)
	private String phone1;

	@Column(name="PHONE2", nullable=false, length=20)
	private String phone2;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REG_TIME")
	private Date regTime;

	@Column(name="SEX")
	private byte sex;

	@Column(name="STUDENT_CODE", nullable=false, length=20)
	private String studentCode;

	@Column(name="WEIGHT", precision=10, scale=2)
	private BigDecimal weight;

	public HlwStudentJo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte getAge() {
		return this.age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public BigDecimal getHeight() {
		return this.height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Boolean getIsCpc() {
		return this.isCpc;
	}

	public void setIsCpc(Boolean isCpc) {
		this.isCpc = isCpc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public Date getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public byte getSex() {
		return this.sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getStudentCode() {
		return this.studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}