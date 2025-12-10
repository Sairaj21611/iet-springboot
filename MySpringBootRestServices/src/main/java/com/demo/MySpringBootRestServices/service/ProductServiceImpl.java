package com.demo.MySpringBootRestServices.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.MySpringBootRestServices.beans.Product;
import com.demo.MySpringBootRestServices.dao.ProductDao;
import com.demo.MySpringBootRestServices.dto.ProductDto;
import com.demo.MySpringBootRestServices.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDao pdao;

	@Override
	public List<ProductDto> getAllProducts() {
		List<Product> plist = pdao.findAll();
		List<ProductDto> list = plist.stream()
				.map(prod->ProductMapper.mapToProductDto(prod))
				.collect(Collectors.toList());
		return list;
	}

	@Override
	public ProductDto getById(int pid) {
		
		Optional<Product> plist = pdao.findById(pid);
		if(plist.isPresent()) {
			ProductDto prod = ProductMapper.mapToProductDto(plist.get());
			return prod;
		}
		return null;
	}

	@Override
	public boolean addProduct(ProductDto p) {
		
		Product prod = ProductMapper.mapToProduct(p);
		Product p1 = pdao.save(prod);
		return p1!=null;
		
	}

	@Override
	public boolean updateProduct(ProductDto pid) {
		
		Product p = ProductMapper.mapToProduct(pid);
		Optional<Product> op = pdao.findById(p.getPid());
		
		if(op.isPresent()) {
			Product prod = op.get();
			
			prod.setPid(pid.getPid());
			prod.setPname(pid.getPname());
			prod.setQty(pid.getQty());
			prod.setPrice(pid.getPrice());
			pdao.save(prod);
			
			return true;
		}
		return false;
	}

	
	
	
	
}
