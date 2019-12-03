package com.hpeu.web.util;

import com.hpeu.bean.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class UserContext {
	private static final String LOGIN_SESSION_ID="xxx";
	
	public static HttpSession getSession() {
        return ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest().getSession();
    }

    public static User getCurrentUser() {
         Object attribute = getSession().getAttribute(LOGIN_SESSION_ID);
         return (User)attribute;
    }
	
	public static void setCurrentUser(User user) {
		if (user!=null) {
			getSession().setAttribute(LOGIN_SESSION_ID, user);
		}else {
			getSession().invalidate();
		}
	}
}
