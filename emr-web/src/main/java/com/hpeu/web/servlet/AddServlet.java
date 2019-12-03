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

import com.hpeu.bean.User;
import com.hpeu.implement.UserServiceImpl;
import com.hpeu.sercie.UserService;
import com.hpeu.utils.MD5;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	private static final long serialVersionUID = 1582331045615183512L;
	private UserService us =new UserServiceImpl();
	private User user =new User();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		try {
			String realName = request.getParameter("realName");
			String account = request.getParameter("userAccount");
			String password = request.getParameter("userPassword");
			String roleName = request.getParameter("roleName");
			SimpleDateFormat dt =new SimpleDateFormat("yyyy-MM-dd");
			String createDate = dt.format(new Date().getTime());
			Date parse = dt.parse(createDate);
			user.setRealName(realName);
			user.setAccount(account);
			user.setPassword(MD5.MD5Encode(password));
			user.setCreateDate(parse);
			user.setRoleName(roleName);
			System.out.println(roleName);
			if (user.getRoleName().equals("超级管理员")) {
				user.setRoleId(1);
			}else if (user.getRoleName().equals("管理员")) {
				user.setRoleId(2);
			}
			us.addUser(user);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
