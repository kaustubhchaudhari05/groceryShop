package com.hp.grcoeryshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.grcoeryshop.dto.AdminDto;
import com.hp.grcoeryshop.entity.AdminEntity;
import com.hp.grcoeryshop.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public AdminEntity save(AdminEntity adminEntity) {
		AdminEntity adminEntity2 = adminRepository.save(adminEntity);
		return adminEntity2;
	}
	
	public ArrayList<AdminDto> getAdmin(){
		List<AdminEntity> admin = adminRepository.findAll();
		
		ArrayList<AdminDto> adminDtos = new ArrayList<>();
		
		for(AdminEntity adminEntity: admin) {
			
			AdminDto dto = new AdminDto();
			
			int todayYear = LocalDate.now().getYear();
			int dobYear = adminEntity.getDob().getYear();
			
			int age = todayYear - dobYear;
					
			dto.setAdminName(adminEntity.getFirstName() + " " + adminEntity.getLastName());
			dto.setPhone(adminEntity.getContactNo());
			dto.setEmail(adminEntity.getEmail());
			dto.setAge(age);
			dto.setGender(adminEntity.getGender());
			dto.setUserName(adminEntity.getUsername());
			
			adminDtos.add(dto);
		}
		return adminDtos;
	}
	
	public List<AdminEntity> getP(){
		return adminRepository.findAll();
	}

}
