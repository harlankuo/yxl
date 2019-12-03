package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @name：期次实体类
 * @title：Batch.java
 * @descripton：处理期次信息
 * @author：姚臣伟
 * @date：2019年6月24日
 */
//@Table(name = "hpeu_edu_batch")
public class Batch implements Serializable {
	private static final long serialVersionUID = 2204355540825915338L;
	private Integer id; // 主键ID
	private Integer projectId; // 项目编号
	private String batchName; // 期次名称
	private Date createDate; // 创建时间
	private Integer students = 0; // 学员人数
	private Integer classNumber = 0; // 班级数

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

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getStudents() {
		return students;
	}

	public void setStudents(Integer students) {
		this.students = students;
	}

	public Integer getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(Integer classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", projectId=" + projectId + ", batchName=" + batchName + ", createDate=" + createDate
				+ ", students=" + students + ", classNumber=" + classNumber + "]";
	}

}
