package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：培训方向类
 * @title：TrainingTech.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月24日
 */
//@Table(name = "hpeu_edu_trainingTech")
public class Training implements Serializable {
	private static final long serialVersionUID = 7155073549609892168L;
	private Integer id; // ID
	private Integer batchId; // 批次编号
	private String techName; // 实训技术名称

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

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

}
