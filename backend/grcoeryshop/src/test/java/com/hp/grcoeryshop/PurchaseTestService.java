package com.hp.grcoeryshop;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hp.grcoeryshop.entity.PurchaseEntity;
import com.hp.grcoeryshop.service.PurchaseService;

@SpringBootTest
public class PurchaseTestService {

	@Autowired
	private PurchaseService purchaseService;
	
	@Test
	void createPurchase() throws Exception {
		PurchaseEntity entity = new PurchaseEntity();
		entity.setPurchaseid(1);
		entity.setDate(LocalDate.now());
		entity.setCustomerId(1);
		
		purchaseService.save(entity);
	}
	
	@Test
	void getPurchase() throws Exception {
		assertThat(purchaseService.get());
	}
}
