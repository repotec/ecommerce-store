package com.fabric.ecommerce.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fabric.ecommerce.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
}
