package com.hpeu.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;

import com.hpeu.bean.Student;
import com.hpeu.mapper.StudentMapper;
import com.hpeu.utils.MyBatisUtil;
@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			String batchId1 = request.getParameter("batchId");
			String techId1 = request.getParameter("techId");
			String classId1 = request.getParameter("classId");
			String name1 = request.getParameter("name");
			String sno1 = request.getParameter("sno");
			String sex1 = request.getParameter("sex");
			String nation1 = request.getParameter("nation");
			String nativePlace1 = request.getParameter("nativePlace");
			String phone1 = request.getParameter("phone");
			String education1 = request.getParameter("education");
			String graduated1 = request.getParameter("graduated");
			String qq1 = request.getParameter("qq");
			String email1 = request.getParameter("email");
			String emergencyTelephone1 = request.getParameter("emergencyTelephone");
			String school1 = request.getParameter("school");
			String academy1 = request.getParameter("academy");
			String specialty1 = request.getParameter("specialty");
			String admissionDate1 = request.getParameter("admissionDate");
			String leaveTime1 = request.getParameter("leaveTime");
			String theLayTime1 = request.getParameter("theLayTime");
			String dormitory1 = request.getParameter("dormitory");
			String studentStatus1 = request.getParameter("studentStatus");
			String socialSecurity1 = request.getParameter("socialSecurity");
			String emergencyContact1 = request.getParameter("emergencyContact");
			String certificate1 = request.getParameter("certificate");
			String certificateNumber1 = request.getParameter("certificateNumber");
			String classPosition1 = request.getParameter("classPosition");
			String attendance1 = request.getParameter("attendance");
			Student stu =new Student();
				stu.setStudentStatus(studentStatus1);
				stu.setBatchId(Integer.valueOf(batchId1));
				stu.setTechId(Integer.valueOf(techId1));
				stu.setClassId(Integer.valueOf(classId1));
				stu.setName(name1);
				stu.setSno(sno1);
				stu.setSex(sex1);
				stu.setNation(nation1);
				stu.setNativePlace(nativePlace1);
				stu.setPhone(phone1);
				stu.setEducation(education1);
				stu.setGraduated(Integer.valueOf(graduated1));
				stu.setQq(qq1);
				stu.setEmail(email1);
				stu.setEmergencyTelephone(emergencyTelephone1);
				stu.setSchool(school1);
				stu.setAcademy(academy1);
				stu.setSpecialty(specialty1);
				stu.setDormitory(dormitory1);
				stu.setSocialSecurity(socialSecurity1);
				stu.setEmergencyContact(emergencyContact1);
				stu.setCertificateNumber(certificateNumber1);
				stu.setClassPosition(classPosition1);
				stu.setAttendance(attendance1);
				if (!(certificate1.equals("-1"))) {
					stu.setCertificate(Integer.valueOf(certificate1));
				}
				SimpleDateFormat dt =new SimpleDateFormat("yyyy-MM-dd");
				if (!(admissionDate1.equals(""))) {
					Date parse1 = dt.parse(admissionDate1);
					stu.setAdmissionDate(parse1);
				}
				if (!(leaveTime1.equals(""))) {
					Date parse2 = dt.parse(leaveTime1);
					stu.setLeaveTime(parse2);
				}
				if (!(theLayTime1.equals(""))) {
					Date parse3 = dt.parse(theLayTime1);
					stu.setTheLayTime(parse3);
				}
			
			SqlSession session = MyBatisUtil.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			mapper.addStudent(stu);
			session.commit();
			session.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
