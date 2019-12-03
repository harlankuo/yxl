package com.hpeu.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hpeu.bean.User;

public interface UserMapper {
	//登录
	public User login(@Param("account") String account,@Param("password") String password);
	//查询全部用户
	public <T> List<User> findAllUsers();
	//根据账号姓名查询用户
	public User findUserByNameAndAccount(@Param("account") String account,@Param("realName") String realName);
	//删除用户
	public int deletUser(User user);
	//修改用户
	public int updateUser(User user );
	//添加用户
	public int addUser(User user);
	
}
