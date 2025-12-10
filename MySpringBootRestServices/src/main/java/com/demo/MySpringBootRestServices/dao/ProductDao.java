package com.demo.MySpringBootRestServices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.MySpringBootRestServices.beans.*;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

	
}
