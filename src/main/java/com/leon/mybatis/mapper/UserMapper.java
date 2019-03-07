package com.leon.mybatis.mapper;

import java.util.List;

import com.leon.mybatis.entity.User;

public interface UserMapper {
	List<User> selectAlluser();
	
	User selectUserById();
}
