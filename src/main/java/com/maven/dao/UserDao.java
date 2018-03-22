package com.maven.dao;

import java.util.List;

import com.maven.entity.User;

public interface UserDao {
	List<User> findAll();
}
