package com.hpeu.web.controller;

import javax.servlet.http.HttpSession;

import com.hpeu.web.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.hpeu.bean.User;
import com.hpeu.sercie.UserService;
import com.hpeu.utils.MD5;

@Controller
public class LoginController {
	@Autowired
	private UserService service;
	@PostMapping("/login")
	public String login(String username,String password,String vcode,HttpSession session) {
		try {
			User user = service.login(username, MD5.MD5Encode(password));
			String code = (String)session.getAttribute("vcode");
			if (null == code) {
				session.setAttribute("vcodes", "验证码已过期！");
				return "redirect:/login.jsp";
			}
			if (!vcode.equalsIgnoreCase(code)) {
				session.setAttribute("vcodes", "验证码不对！");
				return "redirect:/login.jsp";
			}
			session.setAttribute("username", username);
			UserContext.setCurrentUser(user);
			return "redirect:/admin/index.jsp";
		} catch (Exception e) {
			session.setAttribute("msg", e.getMessage());
			return "redirect:/login.jsp";
		}
		
	}
}
