package com.hp.grcoeryshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.grcoeryshop.dto.AdminDto;
import com.hp.grcoeryshop.entity.AdminEntity;
import com.hp.grcoeryshop.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")
public class Admin {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/save")
	public AdminEntity saveAdmin(@RequestBody AdminEntity adminEntity) {
		return adminService.save(adminEntity);
	}
	
	@GetMapping("/get")
	public ArrayList<AdminDto> getAdmin(){
		return adminService.getAdmin();
	}
	
	@GetMapping("/getp")
	public List<AdminEntity> getP(){
		return adminService.getP();
	}

}
