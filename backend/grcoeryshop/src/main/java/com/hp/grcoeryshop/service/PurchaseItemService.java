package com.hp.grcoeryshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.entity.PurchaseItemEntity;
import com.hp.grcoeryshop.repository.PurchaseItemRepository;

@Service
public class PurchaseItemService {
	
	@Autowired
	private PurchaseItemRepository itemRepository;
	
	public PurchaseItemEntity save(PurchaseItemEntity purchaseItemEntity) {
		PurchaseItemEntity purchaseItemEntity2 = itemRepository.save(purchaseItemEntity);
		return purchaseItemEntity2;
	}
	
	public List<PurchaseItemEntity> get(){
		return itemRepository.findAll();
	}

}
