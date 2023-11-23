package com.hp.grcoeryshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.dto.EmployeeDto;
import com.hp.grcoeryshop.entity.EmployeeEntity;
import com.hp.grcoeryshop.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeEntity save(EmployeeEntity employeeEntity) {
		EmployeeEntity employeeEntity2 = employeeRepository.save(employeeEntity);
		return employeeEntity2;
	}
	
	public ArrayList<EmployeeDto> get(){
		List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
		
		ArrayList<EmployeeDto> dtos = new ArrayList<>();
		
		for(EmployeeEntity employeeEntity: employeeEntities) {
			
			EmployeeDto dto = new EmployeeDto();
			
			int todayYear = LocalDate.now().getYear();
			int dobYear = employeeEntity.getDob().getYear();
			
			int age = todayYear - dobYear;
			
			dto.setEmployeeName(employeeEntity.getFirstName() + " "+ employeeEntity.getLastName());
			dto.setAge(age);
			dto.setEmail(employeeEntity.getEmail());
			dto.setGender(employeeEntity.getGender());
			dto.setPhone(employeeEntity.getContact());
			dto.setUserName(employeeEntity.getUsername());
			
			dtos.add(dto);
		}
		return dtos;
	}
}
