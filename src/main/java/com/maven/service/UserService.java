package com.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.UserDao;
import com.maven.entity.User;

/**
 * Serivce-实现功能
 * @author chen
 *
 */
@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> findAll(){
		return userDao.findAll();
	}
}
