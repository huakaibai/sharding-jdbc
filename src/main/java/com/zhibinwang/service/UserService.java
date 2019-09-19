package com.zhibinwang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhibinwang.entity.UserEntity;
import com.zhibinwang.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	// 使用读的数据源
	public List<UserEntity> findUser() {
		return userMapper.findUser();
	}

	// 使用写的数据源
	public int insertUser(String userName) {
		return userMapper.insertUser(userName);
	}

}
