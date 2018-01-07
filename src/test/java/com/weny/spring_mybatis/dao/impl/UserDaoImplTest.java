package com.weny.spring_mybatis.dao.impl;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weny.spring_mybatis.dao.UserDao;
import com.weny.spring_mybatis.model.User;

public class UserDaoImplTest {

	ApplicationContext ctx = null;

	@Before
	public void setup() throws IOException {
		ctx = new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
	}

	@Test
	public void test() throws Exception {
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		User user = userDao.findUserById(1234);
		System.out.println(user);
	}

}
