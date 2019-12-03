package com.hpeu.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hpeu.bean.User;
import com.hpeu.exception.JdbcException;
import com.hpeu.mapper.UserMapper;
import com.hpeu.sercie.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper um;

	public User login(String username, String password) {
		try {
			User user = um.login(username, password);
			return user;
		} catch (Exception e) {
			throw new JdbcException(e.getMessage());
		}
	}

	public List<User> findAllUsers() {
		return um.findAllUsers();
	}

	public User findUserByNameAndAccount(String account, String realName) {
		return um.findUserByNameAndAccount(account, realName);
		
	}

	public int deletUser(User user) {
		return um.deletUser(user);
	}
	
	public int updateUser(User user) {
		return um.updateUser(user);
	}

	public int addUser(User user) {
		return um.addUser(user);
	}

}
