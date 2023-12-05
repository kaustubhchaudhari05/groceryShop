package com.hp.grcoeryshop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hp.grcoeryshop.entity.CategoryEntity;
import com.hp.grcoeryshop.service.CategoryService;

@SpringBootTest
public class CategoryTestService {

	@Autowired
	private CategoryService categoryService;
	
	@Test
	void createCategory() throws Exception {
		CategoryEntity categoryEntity = new CategoryEntity();
//		categoryEntity.setCategoryId(1l);
		categoryEntity.setCategoryName("Toys");
		
		categoryService.save(categoryEntity);
	}
	
	@Test
	void getAllCategory() throws Exception {
		assertThat(categoryService.get());
	}
	
	@Test
	void updateCategory() throws Exception {
		long categoryId = 1;
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setCategoryName("Vegetables");
		
		assertThat(categoryService.update(categoryId, categoryEntity));
	}
	
	
	
}
