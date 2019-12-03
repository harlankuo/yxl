package com.hpeu.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.google.gson.Gson;
import com.hpeu.bean.MedicalRecord;
import com.hpeu.bean.Patient;
import com.hpeu.bean.SickRecord;
import com.hpeu.sercie.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService ps;

	@GetMapping("/showPatients")
	public void showPatient(Patient patient, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=utf-8");
		System.out.println(patient);
		List<Patient> findpatient = ps.getPatient(patient.getName(), patient.getAge(), patient.getSex(),
				patient.getIdCard(), patient.getNativePlace());
		String patientsJson = new Gson().toJson(findpatient);
		response.getWriter().write(patientsJson);
	}
	
	@GetMapping("/getPatient")
	public String getPatient(Integer id,Model model) {
		System.out.println("id="+id);
		Patient patient = ps.getPatientById(id);
		System.out.println(patient);
		model.addAttribute("patient", patient);
		List<SickRecord> records= ps.getRecordById(id);
		model.addAttribute("records", records);
		List<MedicalRecord> medicals = ps.getMedicalRecordById(id);
		model.addAttribute("medicals", medicals);
		return "/admin/bingli.jsp";
	}
}
