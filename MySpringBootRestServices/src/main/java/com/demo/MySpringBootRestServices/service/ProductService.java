package com.demo.MySpringBootRestServices.service;

import java.util.List;

import com.demo.MySpringBootRestServices.beans.Product;
import com.demo.MySpringBootRestServices.dto.ProductDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	ProductDto getById(int pid);

	boolean addProduct(ProductDto p);

	boolean updateProduct(ProductDto id);



}
