package com.hp.grcoeryshop.service;

import java.util.List;
import java.util.Optional;

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
	
	public CategoryEntity update(Long categoryId, CategoryEntity categoryEntity ) {
		Optional<CategoryEntity> getCategory = categoryRepository.findById(categoryId);
		if(getCategory.isPresent()) {
			CategoryEntity categoryEntity2 = getCategory.get();
			categoryEntity2.setCategoryName(categoryEntity.getCategoryName());
			CategoryEntity categoryEntity3 = categoryRepository.save(categoryEntity2);
			return categoryEntity3;
		} else {
			return categoryEntity;
		}
	}
	
	public Long delete(Long categoryId) {
		categoryRepository.deleteById(categoryId);
		return categoryId;
	}

}
