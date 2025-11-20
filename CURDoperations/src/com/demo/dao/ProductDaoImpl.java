package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	static Connection conn;

	static PreparedStatement insertprod, findById, deleteById, updateById, getById;

	static {
		conn = DBUtil.getMyConnection();

		try {
			insertprod = conn.prepareStatement("insert into test values(?,?,?,?,?)");
			findById = conn.prepareStatement("select * from test");
			deleteById = conn.prepareStatement("delete from test where pid=?");
			updateById = conn.prepareStatement("update test set qty=?, price=? where pid=?");
			findById = conn.prepareStatement("select * from test where pid=?");

		} catch (SQLException e) {
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

	@Override
	public boolean removeById(int id) {
		int n = 0;
		try {
			deleteById.setInt(1, id);

			n = deleteById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n > 0;
	}

	@Override
	public boolean updateById(int id, int qty, Double price) {

		try {
			updateById.setInt(1, qty);
			updateById.setDouble(2, price);
			updateById.setInt(3, id);

			int n = updateById.executeUpdate();
			if (n > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Product getById(int id) {
		return null;
	}
}