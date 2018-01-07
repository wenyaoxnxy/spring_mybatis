package com.weny.spring_mybatis.mapper;

import com.weny.spring_mybatis.model.User;

public interface UserMapper {
	public User selectUserByName(String name) throws Exception;
}
