package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @name：就业情况实体类
 * @title：Employed.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年7月1日
 */
//@Table(name = "hpeu_edu_employed")
public class Employed implements Serializable {
	private static final long serialVersionUID = 4371347933489111223L;
	private Integer id; // id主键
	private Integer classId; // 班级编号
	private Integer studentId; // 学生编号
	private String company; // 就业公司名称
	private Date hiredate; // 入职时间
	private Date departureDate; // 回访时间
	private String position; // 所任岗位
	private String filePath; // 劳动合同路径
	private String contracts; // 劳动合同名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getContracts() {
		return contracts;
	}

	public void setContracts(String contracts) {
		this.contracts = contracts;
	}

}
