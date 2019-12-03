package com.hpeu.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.google.gson.Gson;
import com.hpeu.bean.Student;
import com.hpeu.mapper.StudentMapper;
import com.hpeu.utils.MyBatisUtil;
@WebServlet("/showStudents")
public class ShowStudents extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		SqlSession session = MyBatisUtil.openSession();
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		String batchId = request.getParameter("batchName");
		String techId = request.getParameter("techName");
		String classId = request.getParameter("classId");
		String school = request.getParameter("school");
		String education = request.getParameter("education");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		List<Student> student = mapper.findStudentByTrim(batchId, techId, classId, school, education, name, phone);
		if (student.size()==0||student==null) {
			List<Student> students = mapper.findAllStudent();
			String json = new Gson().toJson(students);
			response.getWriter().write(json);
		}else{
			String json2 = new Gson().toJson(student);
			response.getWriter().write(json2);
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		session.close();
		
		
	}
}
