package com.hpeu.sercie;

import java.util.List;

import com.hpeu.bean.User;

public interface UserService {
	//登录
	public User login (String username,String password);
	//查询全部用户
	public List<User> findAllUsers();	
	//根据账号姓名查询用户
	public User findUserByNameAndAccount(String account,String realName);
	//删除用户
	public int deletUser(User user);
	//修改用户
	public int updateUser(User user );
	//添加用户
	public int addUser(User user);
	
}

