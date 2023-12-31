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

import com.hp.grcoeryshop.dto.EmployeeDto;
import com.hp.grcoeryshop.entity.EmployeeEntity;
import com.hp.grcoeryshop.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:4200")
public class Employee {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.save(employeeEntity);
	}
	
	@GetMapping("/get")
	public ArrayList<EmployeeDto> getEmployee(){
		return employeeService.get();
	}
	
	@GetMapping("/getp")
	public List<EmployeeEntity> getp(){
		return employeeService.getP();
	}

}
