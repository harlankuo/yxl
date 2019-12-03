package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：学生与验收材料中间表
 * @title：StudentEmploymentAcceptance.java
 * @descripton：记录某个学生需要提交的验收材料编号
 * @author：姚臣伟
 * @date：2019年7月11日
 */
//@Table(name = "hpeu_edu_student_employment")
public class StudentEmploymentAcceptance implements Serializable {
	private static final long serialVersionUID = -540386641108113250L;
	private Integer id;
	private Integer sid;
	private Integer eid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

}
