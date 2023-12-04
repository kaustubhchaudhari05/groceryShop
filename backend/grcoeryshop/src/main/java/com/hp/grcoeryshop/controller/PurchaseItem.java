package com.hp.grcoeryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.entity.PurchaseItemEntity;
import com.hp.grcoeryshop.service.PurchaseItemService;

@RestController  
@RequestMapping("/item")
@CrossOrigin("http://localhost:4200")
public class PurchaseItem {

	@Autowired
	private PurchaseItemService itemService;
	
	@PostMapping("/save")
	public PurchaseItemEntity saveItem(@RequestBody PurchaseItemEntity itemEntity) {
		return itemService.save(itemEntity);
	}
	
	@GetMapping("/get")
	public List<PurchaseItemEntity> getItem(){
		return itemService.get();
	}
	
}
