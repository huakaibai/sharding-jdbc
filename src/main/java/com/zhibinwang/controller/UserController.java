package com.zhibinwang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhibinwang.entity.UserEntity;
import com.zhibinwang.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/findUser")
	public List<UserEntity> findUser() {
		return userService.findUser();
	}

	@RequestMapping("/insertUser")
	public String insertUser(String userName) {
		return userService.insertUser(userName) > 0 ? "success" : "fail";
	}

}
