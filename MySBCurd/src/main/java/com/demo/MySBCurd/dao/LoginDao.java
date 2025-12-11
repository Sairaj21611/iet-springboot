package com.demo.MySBCurd.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MySBCurd.beans.LoginUser;

public interface LoginDao extends JpaRepository<LoginUser,String>{


	 // Fetch user by username
    Optional<LoginUser> findByUname(String uname);

    // If you want direct check (not recommended for production)
    Optional<LoginUser> findByUnameAndPassword(String uname, String password);
}
