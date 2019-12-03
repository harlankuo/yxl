package com.hpeu.utils;
//校验字符串是否匹配
public class ValidateUtil {
	public static boolean vaidate(String str,String regex) {
		if (str==null) {
			return false;			
		}else {
			return str.matches(regex);
		}	
	}
}
