package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：就业验收材料存放表
 * @title：Material.java
 * @descripton：用于存放就业验收材料文件
 * @author：姚臣伟
 * @date：2019年7月12日
 */
//@Table(name = "hpeu_edu_material")
public class Material implements Serializable {
	private static final long serialVersionUID = -7381525192579483409L;
	private Integer id; // 主键
	private Integer studentId; // 学生编号
	private Integer employId; // 就业验收编号
	private String showFilename; // 材料显示名称
	private String originalFilename; // 材料原始名称
	private String path; // 材料存放路径

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getEmployId() {
		return employId;
	}

	public void setEmployId(Integer employId) {
		this.employId = employId;
	}

	public String getShowFilename() {
		return showFilename;
	}

	public void setShowFilename(String showFilename) {
		this.showFilename = showFilename;
	}

	public String getOriginalFilename() {
		return originalFilename;
	}

	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
