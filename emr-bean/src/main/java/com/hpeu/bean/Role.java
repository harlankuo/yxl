package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：角色实体类
 * @title：Role.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月17日
 */
//@Table(name = "hpeu_edu_role")
public class Role implements Serializable {
	private static final long serialVersionUID = -4594335328981202363L;
	private Integer id; // 角色编号
	private String roleName; // 角色名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", roleName=" + roleName + "]";
	}

}
