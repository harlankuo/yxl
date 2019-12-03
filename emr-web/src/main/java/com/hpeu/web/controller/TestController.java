package com.hpeu.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hpeu.bean.MedicalRecord;
import com.hpeu.bean.Patient;
import com.hpeu.bean.SickRecord;
import com.hpeu.bean.User;
import com.hpeu.mapper.PatientMapper;
import com.hpeu.sercie.UserService;
import com.hpeu.utils.MD5;

@Controller
public class TestController {
	@Autowired
	private UserService us;
	@Autowired
	private PatientMapper pm;
	@RequestMapping("/test")
	public ModelAndView test() {
		System.out.println("11111111111111111");
		
		/*
		 * List<User> users = us.findAllUsers(); for (User user : users) {
		 * System.out.println(user); }
		 */
		
		/*
		 * User login = us.login("wangjin", null); System.out.println(login);
		 */
		
		/*
		 * User use = us.findUserByNameAndAccount("", ""); System.out.println(use);
		 */
		/*
		 * List<Patient> findAllPatient = pm.findAllPatient(); for (Patient patient :
		 * findAllPatient) { System.out.println(patient); } List<Patient> findPatient =
		 * pm.findPatient("刘兰花",null, "","",""); System.out.println(findPatient);
		 */
		/*
		 * List<SickRecord> findRecordById = pm.findRecordById(1); for (SickRecord
		 * sickRecord : findRecordById) { System.out.println(sickRecord); }
		 */
		List<MedicalRecord> medical = pm.findMedicalRecordById(1);
		for (MedicalRecord medicalRecord : medical) {
			System.out.println(medicalRecord);
		}
		return null;
		
	}
}
