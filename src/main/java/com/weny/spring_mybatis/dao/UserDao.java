package com.weny.spring_mybatis.dao;

import com.weny.spring_mybatis.model.User;

public interface UserDao {

	User findUserById(int id) throws Exception;

}
