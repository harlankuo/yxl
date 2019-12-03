package com.hpeu.bean;

import java.util.Date;

public class SickRecord {
	private Integer rid;
	private String illness;
	private Date sickTime;
	private String hospital;
	private Integer pid;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	public Date getSickTime() {
		return sickTime;
	}
	public void setSickTime(Date sickTime) {
		this.sickTime = sickTime;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public SickRecord(Integer rid, String illness, Date sickTime, String hospital, Integer pid) {
		super();
		this.rid = rid;
		this.illness = illness;
		this.sickTime = sickTime;
		this.hospital = hospital;
		this.pid = pid;
	}
	public SickRecord() {
		super();
	}
	@Override
	public String toString() {
		return "SickRecord [rid=" + rid + ", illness=" + illness + ", sickTime=" + sickTime + ", hospital=" + hospital
				+ ", pid=" + pid + "]";
	}
	
}