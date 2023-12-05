package com.hp.grcoeryshop;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hp.grcoeryshop.entity.EmployeeEntity;
import com.hp.grcoeryshop.service.EmployeeService;

@SpringBootTest
public class EmployeeTestService {

	@Autowired
	private EmployeeService employeeService;
	
	@Test
	void saveEmployee() throws Exception {
		EmployeeEntity employeeEntity = new EmployeeEntity();
//		employeeEntity.setEmployeeId(5);
		employeeEntity.setFirstName("def");
		employeeEntity.setLastName("de");
		employeeEntity.setContact(745896321);
		employeeEntity.setDob(LocalDate.of(2000, 2, 29));
//		employeeEntity.setDob();
		employeeEntity.setEmail("def@gmail.com");
		employeeEntity.setGender("female");
		employeeEntity.setUsername("def05");
		employeeEntity.setPassword("def@0512");
		
		employeeService.save(employeeEntity);
//		asse
	}
	
	@Test
	void getAllEmployeeDtos() throws Exception {
		assertThat(employeeService.get());
	}
	
	@Test
	void getAll() throws Exception {
		assertThat(employeeService.getP());
	}
	
	
}
