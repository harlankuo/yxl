package com.hpeu.sercie;

import java.util.List;

import com.hpeu.bean.MedicalRecord;
import com.hpeu.bean.Patient;
import com.hpeu.bean.SickRecord;

public interface PatientService {
	//查询单个病人
	public List<Patient> getPatient(String name,Integer age,String sex,String idCard,String nativePlace);
	//查询全部病人
	public List<Patient> getAllPatient();
	//通过编号删除病人
	public void removePatient(Integer id);
	//添加病人
	public void savePatient(Patient patient);
	//修改病人
	public void modifyPatient(Patient patient);
	//根据id查询
	public Patient getPatientById(Integer id);
	//通过id多表查询诊断记录
	public List<SickRecord> getRecordById(Integer id);
	//通过id多表查询用药记录
	public List<MedicalRecord> getMedicalRecordById(Integer id);
}
