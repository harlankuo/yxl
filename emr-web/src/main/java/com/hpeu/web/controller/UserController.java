package com.hpeu.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.google.gson.Gson;
import com.hpeu.bean.User;
import com.hpeu.implement.UserServiceImpl;
import com.hpeu.sercie.UserService;

@Controller
public class UserController {
	@Autowired
	UserService us =new UserServiceImpl();
	@GetMapping("/showUser")
	public void showUser(String account,String realName,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		List<User> user = us.findAllUsers();
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
