package main.src.org.lanqiao.web.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;



import com.sun.org.apache.bcel.internal.generic.Select;

import main.src.org.lanqiao.web.crud.entity.User;

public interface UserMapper {



	public List<User> findAll();
 
}
