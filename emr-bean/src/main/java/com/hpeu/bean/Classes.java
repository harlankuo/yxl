package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @name：班级实体类
 * @title：Classes.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月24日
 */
//@Table(name = "hpeu_edu_classes")
public class Classes implements Serializable {
	private static final long serialVersionUID = -5570702836065700305L;
	private Integer id; // 主键ID
	private Integer batchId; // 批次编号
	private Integer techId; // 培训方向编号
	private String className; // 班级名称
	private String classAdviser; // 班主任，填写
	private String classTeacher; // 讲师
	private Integer amount; // 学员人数
	private Integer training; // 实训人数
	private Integer backTraining; // 退训人数
	private Integer quitSchool; // 休学人数
	private Integer haveJobs; // 已就业人数
	private Integer unemployed; // 未就业人数
	private Double employmentRate; // 就业率
	private Integer activities; // 团建次数
	private Integer exceptions; // 异常提醒
	private Date createDate; // 日期

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassAdviser() {
		return classAdviser;
	}

	public void setClassAdviser(String classAdviser) {
		this.classAdviser = classAdviser;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getTraining() {
		return training;
	}

	public void setTraining(Integer training) {
		this.training = training;
	}

	public Integer getBackTraining() {
		return backTraining;
	}

	public void setBackTraining(Integer backTraining) {
		this.backTraining = backTraining;
	}

	public Integer getQuitSchool() {
		return quitSchool;
	}

	public void setQuitSchool(Integer quitSchool) {
		this.quitSchool = quitSchool;
	}

	public Integer getHaveJobs() {
		return haveJobs;
	}

	public void setHaveJobs(Integer haveJobs) {
		this.haveJobs = haveJobs;
	}

	public Integer getUnemployed() {
		return unemployed;
	}

	public void setUnemployed(Integer unemployed) {
		this.unemployed = unemployed;
	}

	public Double getEmploymentRate() {
		return employmentRate;
	}

	public void setEmploymentRate(Double employmentRate) {
		this.employmentRate = employmentRate;
	}

	public Integer getActivities() {
		return activities;
	}

	public void setActivities(Integer activities) {
		this.activities = activities;
	}

	public Integer getExceptions() {
		return exceptions;
	}

	public void setExceptions(Integer exceptions) {
		this.exceptions = exceptions;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", batchId=" + batchId + ", techId=" + techId + ", className=" + className
				+ ", classAdviser=" + classAdviser + ", classTeacher=" + classTeacher + ", amount=" + amount
				+ ", training=" + training + ", backTraining=" + backTraining + ", quitSchool=" + quitSchool
				+ ", haveJobs=" + haveJobs + ", unemployed=" + unemployed + ", employmentRate=" + employmentRate
				+ ", activities=" + activities + ", exceptions=" + exceptions + ", createDate=" + createDate + "]";
	}

}
