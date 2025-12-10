package com.demo.MySpringBootRestServices.service;

import com.demo.MySpringBootRestServices.beans.MyUSer;

public interface LoginService {

	MyUSer validateUser(String uname, String passwd);

}
