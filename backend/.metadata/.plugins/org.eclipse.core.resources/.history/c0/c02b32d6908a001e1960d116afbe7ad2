package com.hp.grcoeryshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.entity.CategoryEntity;
import com.hp.grcoeryshop.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public CategoryEntity save(CategoryEntity categoryEntity) {
		CategoryEntity categoryEntity2 = categoryRepository.save(categoryEntity);
		return categoryEntity2;
	}
	
	public List<CategoryEntity> get(){
		return categoryRepository.findAll();
	}

}
