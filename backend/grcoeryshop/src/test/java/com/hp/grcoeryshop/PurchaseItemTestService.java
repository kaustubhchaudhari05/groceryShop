package com.hp.grcoeryshop;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hp.grcoeryshop.entity.PurchaseItemEntity;
import com.hp.grcoeryshop.service.PurchaseItemService;

@SpringBootTest
public class PurchaseItemTestService {

	@Autowired
	private PurchaseItemService itemService;
	
	@Test
	void createItem() throws Exception {
		PurchaseItemEntity itemEntity = new PurchaseItemEntity();
		
		itemEntity.setItemid(1);
		itemEntity.setProductId(1);
		itemEntity.setProductQuantity(2);
		itemEntity.setPurchaseid(1);
		
		itemService.save(itemEntity);
	}
	
	@Test
	void get() throws Exception {
		assertThat(itemService.get());
	}
}
