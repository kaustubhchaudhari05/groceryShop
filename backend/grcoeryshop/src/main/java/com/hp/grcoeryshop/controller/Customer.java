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

import com.hp.grcoeryshop.dto.CustomerDto;
import com.hp.grcoeryshop.entity.CustomerEntity;
import com.hp.grcoeryshop.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:4200")
public class Customer {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public CustomerEntity saveCustomer(@RequestBody CustomerEntity customerEntity) {
		return customerService.save(customerEntity);
	}
	
	@GetMapping("/get")
	public ArrayList<CustomerDto> getCustomer(){
		return customerService.get();
	}
	
	@GetMapping("/getp")
	public List<CustomerEntity> getp(){
		return customerService.getP();
	}
}
