package com.demo.MySBCurd.service;

import com.demo.MySBCurd.beans.LoginUser;

public interface LoginService {

	LoginUser validateUser(String uname, String password);


}
