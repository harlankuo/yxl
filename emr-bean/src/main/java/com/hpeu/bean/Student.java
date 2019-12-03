package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @name：学生实体类
 * @title：Student.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月25日
 */
//@Table(name = "hpeu_edu_student")
public class Student implements Serializable {
	private static final long serialVersionUID = -7931701624100148783L;
	private Integer id; // 主键
	private Integer projectId; // 项目编号
	private Integer batchId; // 期次编号
	private Integer techId; // 实训方向编号
	private Integer classId; // 班级编号
	private String code; // 学生编号
	private String name; // 学生姓名
	private String sno; // 学号
	private String sex; // 性别
	private String nation; // 民族
	private String nativePlace; // 籍贯
	private String phone; // 联系电话
	private String qq; // QQ
	private String carded; // 身份证号
	private String emergencyTelephone; // 紧急联系电话
	private String email; // 邮箱
	private Date admissionDate; // 入学时间
	private Date leaveTime; // 离校时间
	private Date theLayTime; // 退寝时间
	private String dormitory; // 寝室号
	private String school; // 毕业院校
	private String education; // 学历
	private String academy; // 二级院校
	private String specialty; // 所学专业
	private Integer graduated; // 是否毕业：0未，1是
	private String studentStatus; // 就业状态
	private String socialSecurity; // 社保交纳地
	private String abnormalRemind; // 异常提醒
	
	private String classPosition; // 班级职务
	private Integer certificate; // 是否发放毕业证：0未，1是
	private String certificateNumber; // 证书编号
	private String emergencyContact; // 紧急联系人
	private String avatar; // 头像
	private String attendance; // 考勤天数
	private Integer close; // 是否关闭：1正常；0关闭

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Integer getGraduated() {
		return graduated;
	}

	public void setGraduated(Integer graduated) {
		this.graduated = graduated;
	}

	public String getCarded() {
		return carded;
	}

	public void setCarded(String carded) {
		this.carded = carded;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getClassPosition() {
		return classPosition;
	}

	public void setClassPosition(String classPosition) {
		this.classPosition = classPosition;
	}

	public String getDormitory() {
		return dormitory;
	}

	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public Date getTheLayTime() {
		return theLayTime;
	}

	public void setTheLayTime(Date theLayTime) {
		this.theLayTime = theLayTime;
	}

	public Integer getCertificate() {
		return certificate;
	}

	public void setCertificate(Integer certificate) {
		this.certificate = certificate;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyTelephone() {
		return emergencyTelephone;
	}

	public void setEmergencyTelephone(String emergencyTelephone) {
		this.emergencyTelephone = emergencyTelephone;
	}

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public String getAbnormalRemind() {
		return abnormalRemind;
	}

	public void setAbnormalRemind(String abnormalRemind) {
		this.abnormalRemind = abnormalRemind;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public Integer getClose() {
		return close;
	}

	public void setClose(Integer close) {
		this.close = close;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", projectId=" + projectId + ", batchId=" + batchId + ", techId=" + techId
				+ ", classId=" + classId + ", code=" + code + ", name=" + name + ", sno=" + sno + ", sex=" + sex
				+ ", nation=" + nation + ", nativePlace=" + nativePlace + ", phone=" + phone + ", qq=" + qq
				+ ", carded=" + carded + ", emergencyTelephone=" + emergencyTelephone + ", email=" + email
				+ ", admissionDate=" + admissionDate + ", leaveTime=" + leaveTime + ", theLayTime=" + theLayTime
				+ ", dormitory=" + dormitory + ", school=" + school + ", education=" + education + ", academy="
				+ academy + ", specialty=" + specialty + ", graduated=" + graduated + ", studentStatus=" + studentStatus
				+ ", socialSecurity=" + socialSecurity + ", abnormalRemind=" + abnormalRemind + ", classPosition="
				+ classPosition + ", certificate=" + certificate + ", certificateNumber=" + certificateNumber
				+ ", emergencyContact=" + emergencyContact + ", avatar=" + avatar + ", attendance=" + attendance
				+ ", close=" + close + "]";
	}

/*	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", sno=" + sno + ", sex=" + sex + ", phone=" + phone
				+ ", email=" + email + ", qq=" + qq + "]";
	}*/
	
}
