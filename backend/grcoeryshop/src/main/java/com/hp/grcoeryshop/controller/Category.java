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

import com.hp.grcoeryshop.entity.CategoryEntity;
import com.hp.grcoeryshop.service.CategoryService;


@RestController
@RequestMapping("/category")
@CrossOrigin("http://localhost:4200")
public class Category {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/save")
	public CategoryEntity saveCategory(@RequestBody CategoryEntity categoryEntity) {
		return categoryService.save(categoryEntity);
	}
	
	@GetMapping("/get")
	public List<CategoryEntity> getCategory(){
		return categoryService.get();
	}
	
	@PutMapping("/{categoryId}")
	public CategoryEntity updateCategory(@PathVariable("categoryId") Long categoryId, @RequestBody CategoryEntity categoryEntity) {
		return categoryService.update(categoryId, categoryEntity);
	}
	
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable("categoryId") Long categoryId) {
		categoryService.delete(categoryId);
	}

}
