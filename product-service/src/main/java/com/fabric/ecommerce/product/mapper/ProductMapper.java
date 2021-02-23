package com.fabric.ecommerce.product.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.fabric.ecommerce.product.dto.ProductDTO;
import com.fabric.ecommerce.product.model.Product;

@Mapper(componentModel = "spting")
public interface ProductMapper {
	
	@Mapping(target = "productId", source = "productId")
	@Mapping(target = "productName", source = "productName")
	ProductDTO productToProductDTO(Product product);
}
