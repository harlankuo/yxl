package com.hpeu.bean;

public class Patient {
	private Integer id;//编号  
	private String name;//姓名
	private Integer age;//年龄
	private String idCard;//身份证
	private String sex;//性别
	private String phone;//电话
	private String nativePlace;//出生地
	private String nationality;//国籍
	private String maritalStatus;//婚姻状况
	
	private String address;//通讯地址
	private String firstClinicTime;//第一次就诊时间
	private String recentDiagnose;//最近诊断
	private String diagnose;//诊断
	private String operation;//手术
	private String allergen;//过敏源
	
	private String mainSuit;
	private String medicalHistory;
	private String pastHistory;
	private String personHistory;
	private String familyHistory;
	private String marryHistory;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstClinicTime() {
		return firstClinicTime;
	}
	public void setFirstClinicTime(String firstClinicTime) {
		this.firstClinicTime = firstClinicTime;
	}
	public String getRecentDiagnose() {
		return recentDiagnose;
	}
	public void setRecentDiagnose(String recentDiagnose) {
		this.recentDiagnose = recentDiagnose;
	}
	public String getDiagnose() {
		return diagnose;
	}
	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getAllergen() {
		return allergen;
	}
	public void setAllergen(String allergen) {
		this.allergen = allergen;
	}
	public String getMainSuit() {
		return mainSuit;
	}
	public void setMainSuit(String mainSuit) {
		this.mainSuit = mainSuit;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public String getPastHistory() {
		return pastHistory;
	}
	public void setPastHistory(String pastHistory) {
		this.pastHistory = pastHistory;
	}
	public String getPersonHistory() {
		return personHistory;
	}
	public void setPersonHistory(String personHistory) {
		this.personHistory = personHistory;
	}
	public String getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}
	public String getMarryHistory() {
		return marryHistory;
	}
	public void setMarryHistory(String marryHistory) {
		this.marryHistory = marryHistory;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer id, String name, Integer age, String idCard, String sex, String phone, String nativePlace,
			String nationality, String maritalStatus, String address, String firstClinicTime, String recentDiagnose,
			String diagnose, String operation, String allergen, String mainSuit, String medicalHistory,
			String pastHistory, String personHistory, String familyHistory, String marryHistory) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.idCard = idCard;
		this.sex = sex;
		this.phone = phone;
		this.nativePlace = nativePlace;
		this.nationality = nationality;
		this.maritalStatus = maritalStatus;
		this.address = address;
		this.firstClinicTime = firstClinicTime;
		this.recentDiagnose = recentDiagnose;
		this.diagnose = diagnose;
		this.operation = operation;
		this.allergen = allergen;
		this.mainSuit = mainSuit;
		this.medicalHistory = medicalHistory;
		this.pastHistory = pastHistory;
		this.personHistory = personHistory;
		this.familyHistory = familyHistory;
		this.marryHistory = marryHistory;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", idCard=" + idCard + ", sex=" + sex
				+ ", phone=" + phone + ", nativePlace=" + nativePlace + ", nationality=" + nationality
				+ ", maritalStatus=" + maritalStatus + ", address=" + address + ", firstClinicTime=" + firstClinicTime
				+ ", recentDiagnose=" + recentDiagnose + ", diagnose=" + diagnose + ", operation=" + operation
				+ ", allergen=" + allergen + ", mainSuit=" + mainSuit + ", medicalHistory=" + medicalHistory
				+ ", pastHistory=" + pastHistory + ", personHistory=" + personHistory + ", familyHistory="
				+ familyHistory + ", marryHistory=" + marryHistory + "]";
	}
	
	
}
