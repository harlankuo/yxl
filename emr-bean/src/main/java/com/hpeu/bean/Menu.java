package com.hpeu.bean;

import java.io.Serializable;

/**
 * @name：菜单实体类
 * @title：Menu.java
 * @descripton：
 * @author：姚臣伟
 * @date：2019年6月11日
 */
//@Table(name = "hpeu_edu_menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = 6759395783906518973L;
	private Integer id; // 编号
	private Integer parentId; // 父级
	private Integer level; // 层级
	private Integer sort; // 排序
	private String menuName; // 菜单
	private String href; // 链接
	private String mark; // 菜单标识

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", parentId=" + parentId + ", level=" + level + ", sort=" + sort + ", menuName="
				+ menuName + ", href=" + href + "]";
	}

}
