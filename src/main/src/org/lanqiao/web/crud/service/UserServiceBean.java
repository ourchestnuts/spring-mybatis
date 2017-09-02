package main.src.org.lanqiao.web.crud.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import main.src.org.lanqiao.web.crud.dao.UserMapper;
import main.src.org.lanqiao.web.crud.entity.User;

public class UserServiceBean {
	private UserMapper userMapper;
	public void setUserMapper(UserMapper userMapper){
		this.userMapper=userMapper;
	}
	
	public List<User> findAll(){
		return userMapper.findAll();
	}

}
