package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：学生综合能力类
 * @title：ComprehensiveCapacity.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年7月1日
 */
//@Table(name = "hpeu_edu_comprehensiveCapacity")
public class ComprehensiveCapacity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id; // 主键
	private Integer classId; // 班级编号
	private Integer studentId; // 学生编号
	private Double leadership = 0.00; // 领导能力
	private Double skillLevel = 0.00; // 技能水平
	private Double communicationSkills = 0.00; // 沟通能力
	private Double teamwork = 0.00; // 团队合作
	private Double coordination = 0.00; // 协调能力
	private String ranking; // 综合评级
	private Double senate = 0.00; // 教务考核成绩
	private Double teaching = 0.00; // 教学考核成绩
	private Double assessment = 0.00; // 综合考核成绩
	private String advantage; // 学员优势
	private String inferiority; // 学员劣势

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

	public Double getLeadership() {
		return leadership;
	}

	public void setLeadership(Double leadership) {
		this.leadership = leadership;
	}

	public Double getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Double skillLevel) {
		this.skillLevel = skillLevel;
	}

	public Double getCommunicationSkills() {
		return communicationSkills;
	}

	public void setCommunicationSkills(Double communicationSkills) {
		this.communicationSkills = communicationSkills;
	}

	public Double getTeamwork() {
		return teamwork;
	}

	public void setTeamwork(Double teamwork) {
		this.teamwork = teamwork;
	}

	public Double getCoordination() {
		return coordination;
	}

	public void setCoordination(Double coordination) {
		this.coordination = coordination;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public Double getSenate() {
		return senate;
	}

	public void setSenate(Double senate) {
		this.senate = senate;
	}

	public Double getTeaching() {
		return teaching;
	}

	public void setTeaching(Double teaching) {
		this.teaching = teaching;
	}

	public Double getAssessment() {
		return assessment;
	}

	public void setAssessment(Double assessment) {
		this.assessment = assessment;
	}

	public String getAdvantage() {
		return advantage;
	}

	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}

	public String getInferiority() {
		return inferiority;
	}

	public void setInferiority(String inferiority) {
		this.inferiority = inferiority;
	}

}
