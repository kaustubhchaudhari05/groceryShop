package com.hp.grcoeryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.entity.CategoryEntity;
import com.hp.grcoeryshop.service.CategoryService;


@RestController
@RequestMapping("/category")
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

}