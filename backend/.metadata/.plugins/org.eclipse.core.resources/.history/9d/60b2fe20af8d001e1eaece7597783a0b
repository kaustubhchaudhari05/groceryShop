package com.hp.grcoeryshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.entity.ProductEntity;
import com.hp.grcoeryshop.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public ProductEntity save(ProductEntity productEntity) {
		ProductEntity productEntity2 = productRepository.save(productEntity);
		return productEntity2;
	}
	
	public List<ProductEntity> get(){
		return productRepository.findAll();
	}
	
	public ProductEntity update(Long productId, ProductEntity productEntity) {
		Optional<ProductEntity> getProduct =  productRepository.findById(productId);
		if(getProduct.isPresent()) {
			ProductEntity productEntity2 = getProduct.get();
			productEntity2.setProductName(productEntity.getProductName());
			productEntity2.setProductQuantity(productEntity.getProductQuantity());
			productEntity2.setProductPrice(productEntity.getProductPrice());
			ProductEntity productEntity3 = productRepository.save(productEntity2);
			return productEntity3;
		} else {
			return productEntity;
		}
	}
	
	public void delete(Long productId) {
		 productRepository.deleteById(productId);
	}

}
