package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {

	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public MyUser validateuser(String uname, String pass) {
		
		try {
			MyUser u1=jdbctemplate.queryForObject("select * from user where uname=? and passwd=?",
					new Object[] {uname,pass},BeanPropertyRowMapper.newInstance(MyUser.class));
		System.out.println(u1);
		return u1;
		}catch(EmptyResultDataAccessException e) {
			System.out.println("User not found");
			return null;
		}
	}

}
