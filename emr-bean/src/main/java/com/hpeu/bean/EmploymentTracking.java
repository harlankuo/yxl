package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @name：就业跟踪实体类
 * @title：EmploymentTracking.java
 * @descripton：对学生就业数据进行跟踪记录
 * @author：姚臣伟
 * @date：2019年7月8日
 */
//@Table(name = "hpeu_edu_employmentTracking")
public class EmploymentTracking implements Serializable {
	private static final long serialVersionUID = -1722702104977749697L;
	private Integer id; // 主键
	private Integer projectId; // 项目编号
	private Integer batchId; // 期次编号
	private Integer techId; // 方向编号
	private Integer classId; // 班级编号
	private Integer studentId; // 学生编号
	private String name; // 学生姓名
	private String sno; // 学号
	private String compayName; // 公司名称
	private String area; // 所属区域
	private String position; // 职位：Java开发工程师、软件测试工程师、大数据工程师、安卓开发工程师、前端开发工程师、嵌入式开发工程师、系统运维工程师、技术实施、技术支持、电子商务、销售、其他
	private String type; // 员工类型：实习生、正式员工
	private String internshipPay; // 实习薪资
	private String correctionSalary; // 转正薪资
	private Date entryTime; // 入职时间
	private Date quitTime; // 离职时间
	private String employmentCycle; // 就业周期
	private String socialInsuranceMonth; // 社保缴纳月
	private String socialInsurancePlace; // 社保缴纳地：遵义、其他
	private String certificate; // 证明文件：实习协议、劳动合同、用人单位申请表、实习接收函、工作单位接收函、在职证明、三方协议、无
	private int close = 1; // 是否删除：0是，1不是

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getCompayName() {
		return compayName;
	}

	public void setCompayName(String compayName) {
		this.compayName = compayName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInternshipPay() {
		return internshipPay;
	}

	public void setInternshipPay(String internshipPay) {
		this.internshipPay = internshipPay;
	}

	public String getCorrectionSalary() {
		return correctionSalary;
	}

	public void setCorrectionSalary(String correctionSalary) {
		this.correctionSalary = correctionSalary;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getQuitTime() {
		return quitTime;
	}

	public void setQuitTime(Date quitTime) {
		this.quitTime = quitTime;
	}

	public String getEmploymentCycle() {
		return employmentCycle;
	}

	public void setEmploymentCycle(String employmentCycle) {
		this.employmentCycle = employmentCycle;
	}

	public String getSocialInsuranceMonth() {
		return socialInsuranceMonth;
	}

	public void setSocialInsuranceMonth(String socialInsuranceMonth) {
		this.socialInsuranceMonth = socialInsuranceMonth;
	}

	public String getSocialInsurancePlace() {
		return socialInsurancePlace;
	}

	public void setSocialInsurancePlace(String socialInsurancePlace) {
		this.socialInsurancePlace = socialInsurancePlace;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public int getClose() {
		return close;
	}

	public void setClose(int close) {
		this.close = close;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", projectId=" + projectId + ", batchId=" + batchId + ", techId="
				+ techId + ", classId=" + classId + ", studentId=" + studentId + ", name=" + name + ", sno=" + sno
				+ ", compayName=" + compayName + ", area=" + area + ", position=" + position + ", type=" + type
				+ ", internshipPay=" + internshipPay + ", correctionSalary=" + correctionSalary + ", entryTime="
				+ entryTime + ", quitTime=" + quitTime + ", employmentCycle=" + employmentCycle
				+ ", socialInsuranceMonth=" + socialInsuranceMonth + ", socialInsurancePlace=" + socialInsurancePlace
				+ ", certificate=" + certificate + ", close=" + close + "]";
	}

}
