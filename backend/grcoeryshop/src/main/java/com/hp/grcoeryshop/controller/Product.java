package com.hp.grcoeryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.entity.ProductEntity;
import com.hp.grcoeryshop.repository.ProductRepository;
import com.hp.grcoeryshop.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:4200")
public class Product {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/save")
	public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
		return productService.save(productEntity);
	}
	
	@GetMapping("/get")
	public List<ProductEntity> getProduct(){
		return productService.get();
	}
	
	@GetMapping("/get/{productId}")
	public ProductEntity getById(@PathVariable("productId") Long productId){
		ProductEntity entity= productRepository.findById(productId).get();
		return entity;
	}
	
	@GetMapping("/{categoryId}")
	public List<ProductEntity> getByCategoryId(@PathVariable("categoryId") Long categoryId){
		return productService.getByCategoryId(categoryId);
	}
	
	@PutMapping("/{productId}")
	public ProductEntity updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductEntity productEntity) {
		return productService.update(productId, productEntity);
	}
	
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId") Long productId) {
		productService.delete(productId);
	}

}
