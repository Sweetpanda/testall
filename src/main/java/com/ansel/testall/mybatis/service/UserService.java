package com.ansel.testall.mybatis.service;

import com.ansel.testall.mybatis.model.User;

public interface UserService {
	int insert(User user);

	int insertSelective(User user);

	User getUserById(Integer userId);
}
