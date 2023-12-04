package com.hp.grcoeryshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.entity.PurchaseEntity;
import com.hp.grcoeryshop.repository.PurchaseRepository;

@Service
public class PurchaseService {

	@Autowired 
	private PurchaseRepository purchaseRepository;
	
	public PurchaseEntity save(PurchaseEntity purchaseEntity) {
		PurchaseEntity purchaseEntity2 = purchaseRepository.save(purchaseEntity);
		return purchaseEntity2;
	}
	
	public List<PurchaseEntity> get() {
		return purchaseRepository.findAll();
	}
}
