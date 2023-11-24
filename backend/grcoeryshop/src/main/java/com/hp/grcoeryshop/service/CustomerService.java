package com.hp.grcoeryshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.dto.CustomerDto;
import com.hp.grcoeryshop.entity.CustomerEntity;
import com.hp.grcoeryshop.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired 
	private CustomerRepository customerRepository;
	
	public CustomerEntity save(CustomerEntity customerEntity) {
		CustomerEntity customerEntity2 = customerRepository.save(customerEntity);
		return customerEntity2;
	}
	
	public ArrayList<CustomerDto> get(){
		List<CustomerEntity> customerEntities = customerRepository.findAll();
		
		ArrayList<CustomerDto> dtos = new ArrayList<>();
		
		for(CustomerEntity customerEntity: customerEntities) {
			CustomerDto dto = new CustomerDto();
			
			int todayYear = LocalDate.now().getYear();
			int dobYear = customerEntity.getDob().getYear();
			
			int age = todayYear - dobYear;
			
			dto.setCustomerName(customerEntity.getFirstName() + " " + customerEntity.getLastName());
			dto.setAge(age);
			dto.setEmail(customerEntity.getEmail());
			dto.setGender(customerEntity.getGender());
			dto.setPhone(customerEntity.getContact());
			dto.setUserName(customerEntity.getUsername());
			
			dtos.add(dto);
		}
		
		return dtos;
	}
	
	public List<CustomerEntity> getP(){
		return customerRepository.findAll();
	}
}
