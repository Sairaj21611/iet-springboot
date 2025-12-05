package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbctemplet;

	@Override
	public boolean save(Product p) {
		int n = jdbctemplet.update("insert into product values(?,?,?,?,?,?)",
				new Object[] { p.getPid(), p.getPname(), p.getQty(), p.getPrice(), p.getMfgdate(), p.getCid() });
		return n > 0;
	}

	@Override
	public List<Product> getAll() {

		List<Product> plist = jdbctemplet.query("select * from product", (rs, n) -> {
			Product p = new Product();

			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			if (rs.getDate(5) == null) {
				p.setMfgdate(null);
			} else {
				p.setMfgdate(rs.getDate(5).toLocalDate());
			}

			p.setCid(rs.getInt(6));

			return p;
		});
		return plist;
	}
}
