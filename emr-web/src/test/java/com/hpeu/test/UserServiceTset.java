package com.hpeu.test;

import java.util.List;

import com.hpeu.bean.User;
import com.hpeu.implement.UserServiceImpl;
import com.hpeu.sercie.UserService;
import com.hpeu.utils.MD5;

public class UserServiceTset {
	/*
	 * public static void main(String[] args) { UserService us =new
	 * UserServiceImpl(); User user=us.login("wangjin", MD5.MD5Encode("123456"));
	 * List<User> findAllUsers = us.findAllUsers(); for (User user2 : findAllUsers)
	 * { System.out.println(user2);
	 * 
	 * }
	 * 
	 * }
	 */
public static void main(String[] args) {
	UserService us =new UserServiceImpl();
	List<User> findAllUsers = us.findAllUsers();
	for (User user2 : findAllUsers) {
		System.out.println(user2);
		
	}
}
}
