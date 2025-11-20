package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Products;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static PreparedStatement insProd;
	
	static {
		conn = DBUtil.getMyConnection();
		try {
			insProd = conn.prepareStatement("insert into test values(?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(Products pd) {
		try {
			insProd.setInt(1, pd.getPid());
			insProd.setString(2, pd.getPname());
			insProd.setInt(3, pd.getQty());
			insProd.setDouble(4, pd.getPrice());
			insProd.setDate(5, java.sql.Date.valueOf(pd.getDate()));
			
			int n = insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
