package com.weny.spring_mybatis.mapper;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weny.spring_mybatis.model.User;

public class UserMapperTest {


	ApplicationContext ctx = null;

	@Before
	public void setup() throws IOException {
		ctx = new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
	}

	@Test
	public void test() throws Exception {
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		User user = userMapper.selectUserByName("lisi");
		System.out.println(user);
	}
}
