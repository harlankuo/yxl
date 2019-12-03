package com.hpeu.web.config;

public class WebConfig {
	public static final String USERNAME_REGIX = "^[a-zA-Z]\\w{4,15}$";
	public static final String PASSWORD_REGIX = "^\\w{6,16}$";
	public static final String EMAIL_REGIX = "^\\w+@\\w+(\\.[a-zA-Z0-9]{2,3}){1,2}$";
	public static final String VCODE_REGIX = "^[a-zA-Z2-9]{4}$";
}
