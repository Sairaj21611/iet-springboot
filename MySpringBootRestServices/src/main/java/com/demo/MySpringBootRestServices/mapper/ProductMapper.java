package com.demo.MySpringBootRestServices.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.MySpringBootRestServices.beans.Product;
import com.demo.MySpringBootRestServices.dto.ProductDto;

public class ProductMapper {

	public static Product mapToProduct(ProductDto p) {
		
		
		return new Product(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
		
	}
	
	public static ProductDto mapToProductDto(Product p) {
		if(p.getMfgdate()==null) {
			return new ProductDto(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),null,p.getCid());
		}
		return new ProductDto(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
		
		
	}
}
