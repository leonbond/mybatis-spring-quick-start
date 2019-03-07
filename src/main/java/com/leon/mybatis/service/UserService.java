package com.leon.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leon.mybatis.entity.User;
import com.leon.mybatis.mapper.UserMapper;

public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> selectAllUser() {
	    return userMapper.selectAlluser();
	}
	
	public User selectUserById(int id) {
	    return userMapper.selectUserById();
	}
}
