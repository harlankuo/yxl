package com.hpeu.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpeu.bean.MedicalRecord;
import com.hpeu.bean.Patient;
import com.hpeu.bean.SickRecord;
import com.hpeu.mapper.PatientMapper;
import com.hpeu.sercie.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientMapper pm;
	public List<Patient> getPatient(String name, Integer age, String sex, String idCard, String nativePlace) {
		List<Patient> patients = pm.findPatient(name, age, sex, idCard, nativePlace);
		return patients;
	}

	public List<Patient> getAllPatient() {
		return pm.findAllPatient();
	}

	public void removePatient(Integer id) {
		pm.deletePatient(id);
	}

	public void savePatient(Patient patient) {
		pm.addPatient(patient);
	}

	public void modifyPatient(Patient patient) {
		pm.updatePatient(patient);
	}

	public Patient getPatientById(Integer id) {
		return pm.findPatientById(id);
	}

	public List<SickRecord> getRecordById(Integer id) {
		return pm.findRecordById(id);
	}

	public List<MedicalRecord> getMedicalRecordById(Integer id) {
		return pm.findMedicalRecordById(id);
	}

	
}
