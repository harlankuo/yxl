package com.hpeu.bean;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @name：用户实体类
 * @title：User.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月18日
 */
//@Table(name = "hpeu_edu_user")
public class User implements Serializable {
	private static final long serialVersionUID = -2742049977065052079L;
	private Integer id; // 编号
	@NotNull(message = "{user.account.notnull}")
	@Size(min = 2,max = 16,message = "{user.account.size}")
	private String account; // 登录账号
	@NotNull(message = "{user.account.notnull}")
	@Size(min = 6,max = 12,message = "{user.password.size}")
	private String password; // 登录密码
	private String realName; // 真实姓名
	private Date createDate; // 添加日期
	private int loginTime = 0; // 登录次数
	private Date lastLoginDate; // 最后登录日期
	private int close = 0; // 关闭状态：1正常，0关闭
	private Integer roleId = 0; // 角色编号
	private String roleName; // 角色名称

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(int loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public int getClose() {
		return close;
	}

	public void setClose(int close) {
		this.close = close;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", account=" + account + ", password=" + password + ", realName=" + realName
				+ ", createDate=" + createDate + ", loginTime=" + loginTime + ", lastLoginDate=" + lastLoginDate
				+ ", close=" + close + ", roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
