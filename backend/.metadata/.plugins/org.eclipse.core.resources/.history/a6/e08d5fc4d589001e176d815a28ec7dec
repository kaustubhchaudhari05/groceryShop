package com.hp.grcoeryshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.entity.AdminEntity;
import com.hp.grcoeryshop.repository.AdminRepository;

@RestController
@RequestMapping("/admin")
public class Admin {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@PostMapping("/save")
	public AdminEntity saveAdmin(@RequestBody AdminEntity adminEntity) {
		AdminEntity adminEntity2 = adminRepository.save(adminEntity);
		return adminEntity2;
	}

}
