package com.hp.grcoeryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.entity.PurchaseEntity;
import com.hp.grcoeryshop.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
@CrossOrigin("http://localhost:4200")
public class Purchase {

	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("/save")
	public PurchaseEntity savePurchase(@RequestBody PurchaseEntity purchaseEntity) {
		return purchaseService.save(purchaseEntity);
	}
	
	@GetMapping("/get")
	public List<PurchaseEntity> getPurchase() {
		return purchaseService.get();
	}
}
