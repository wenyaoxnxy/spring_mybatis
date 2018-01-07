package com.weny.spring_mybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.weny.spring_mybatis.dao.UserDao;
import com.weny.spring_mybatis.model.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		return sqlSession.selectOne("user.selectUserById", id);
	}

}
