package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：就业验收实体类
 * @title：EmploymentAcceptance.java
 * @descripton：对就业验收材料配置
 * @author：姚臣伟
 * @date：2019年7月9日
 */
//@Table(name = "hpeu_edu_employmentAcceptance")
public class EmploymentAcceptance implements Serializable {
	private static final long serialVersionUID = 2841220024255645611L;
	private Integer id;  // 编号
	private String name; // 验收项

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmploymentAcceptance [id=" + id + ", name=" + name + "]";
	}

}
