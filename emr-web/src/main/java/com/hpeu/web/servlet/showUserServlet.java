package com.hpeu.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.hpeu.bean.User;
import com.hpeu.implement.UserServiceImpl;
import com.hpeu.sercie.UserService;


public class showUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us =new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		UserServiceImpl us =new UserServiceImpl();
		List<User> user = us.findAllUsers();
		
		String account = request.getParameter("account");
		String realName = request.getParameter("realName");
		User users = us.findUserByNameAndAccount(account, realName);
		if (users!=null) {
			String json2 = new Gson().toJson(users);
			response.getWriter().write("["+json2+"]");
		}else {
			String json = new Gson().toJson(user);
			response.getWriter().write(json);
			
		}
	}
}
