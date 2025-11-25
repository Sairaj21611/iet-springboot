package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser validUser(String uname, String pass);

}
