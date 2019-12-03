package com.hpeu.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.hpeu.bean.User;
import com.hpeu.web.util.UserContext;

public class LoginInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		/*User user = UserContext.getCurrentUser();
		if (user!=null) {
			return true;
		}else {
			*//*response.sendRedirect(request.getContextPath()+"/login.jsp");*//*
			return true;
		}*/
		return true;
	}
}
