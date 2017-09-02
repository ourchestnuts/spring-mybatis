package test.src.org.lanqiao.web.crud.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.src.org.lanqiao.web.crud.entity.User;
import main.src.org.lanqiao.web.crud.service.UserServiceBean;

public class UserServiceBeanTest {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

	@Test
	public void findAll() {
		UserServiceBean userServiceBean=(UserServiceBean) context.getBean("userService");
		List<User> users=userServiceBean.findAll();
		System.out.println(users);
	}

}
