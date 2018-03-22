package com.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maven.entity.User;
import com.maven.service.UserService;

/**
 * 接口编写
 * @author chen
 *
 */
//直接将数据转换为json格式
@RestController
@RequestMapping("/api")
public class UseController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		System.out.println("程序运行到这");
		List<User> user=userService.findAll();
		if (user.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
	}
}
