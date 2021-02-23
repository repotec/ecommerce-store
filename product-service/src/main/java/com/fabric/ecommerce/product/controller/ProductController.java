package com.fabric.ecommerce.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabric.ecommerce.product.model.Product;
import com.fabric.ecommerce.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(path = "/products", method = RequestMethod.GET)
	public List<Product> retrieveAllProduct() {
		return productService.findAllProducts();
	}
}
