package com.demo.MySBCurd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MySBCurd.beans.LoginUser;
import com.demo.MySBCurd.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao ldao;

	@Override
	public LoginUser validateUser(String uname, String password) {
		Optional<LoginUser> userOpt = ldao.findByUnameAndPassword(uname, password);

        return userOpt.orElse(null);  	}

	
}
