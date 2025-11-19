package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	static Connection conn;

	static PreparedStatement insertprod, findById;

	static {
		conn = DBUtil.getMyConnection();

		try {
			insertprod = conn.prepareStatement("insert into test values(?,?,?,?,?)");
			findById = conn.prepareStatement("select * from test");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean save(Product p) {
		int n = 0;
		try {
			insertprod.setInt(1, p.getPid());
			insertprod.setString(2, p.getPname());
			insertprod.setInt(3, p.getQty());
			insertprod.setDouble(4, p.getPrice());
			insertprod.setDate(5, java.sql.Date.valueOf(p.getPdate()));

			n = insertprod.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n > 0;

	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> plist = new ArrayList<>();

		try {
			ResultSet rs = findById.executeQuery();
			while (rs.next()) {
				if (rs.getDate(5) != null) {
					plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
							rs.getDate(5).toLocalDate()));
				} else {
					plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), null));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (plist.size() > 0) {
			return plist;
		} else {
			return null;
		}
	}
}
