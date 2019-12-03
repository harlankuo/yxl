package com.hpeu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpeu.bean.MedicalRecord;
import com.hpeu.bean.Patient;
import com.hpeu.bean.SickRecord;

public interface PatientMapper {
	//查询单个病人
	public List<Patient> findPatient(@Param("name") String name,@Param("age") Integer age,@Param("sex") String sex,
			@Param("idCard") String idCard,@Param("nativePlace") String nativePlace);
	//查询全部病人
	public List<Patient> findAllPatient();
	//通过编号删除病人
	public void deletePatient(Integer id);
	//添加病人
	public void addPatient(Patient patient);
	//修改病人
	public void updatePatient(Patient patient);
	//通过id查询
	public Patient findPatientById(Integer id);
	//通过id多表查询诊断记录
	public List<SickRecord> findRecordById(Integer id);
	//通过id多表查询用药记录
	public List<MedicalRecord> findMedicalRecordById(Integer id);
}
