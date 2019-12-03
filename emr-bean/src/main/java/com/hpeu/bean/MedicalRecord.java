package com.hpeu.bean;

import java.util.Date;

public class MedicalRecord {
	private Integer mid;
	private String drugName;
	private Date medicalTime;
	private String dosage;
	private int pid;
	@Override
	public String toString() {
		return "MedicalRecord [mid=" + mid + ", drugName=" + drugName + ", medicalTime=" + medicalTime + ", dosage="
				+ dosage + ", pid=" + pid + "]";
	}
	public MedicalRecord() {
		super();
	}
	public MedicalRecord(Integer mid, String drugName, Date medicalTime, String dosage, int pid) {
		super();
		this.mid = mid;
		this.drugName = drugName;
		this.medicalTime = medicalTime;
		this.dosage = dosage;
		this.pid = pid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Date getMedicalTime() {
		return medicalTime;
	}
	public void setMedicalTime(Date medicalTime) {
		this.medicalTime = medicalTime;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
}
