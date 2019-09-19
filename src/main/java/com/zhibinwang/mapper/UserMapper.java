package com.zhibinwang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhibinwang.entity.UserEntity;

public interface UserMapper {
	@Select("SELECT * FROM  user_info ")
	public List<UserEntity> findUser();

	@Insert("insert into user_info values (#{userName}); ")
	public int insertUser(@Param("userName") String userName);
}
