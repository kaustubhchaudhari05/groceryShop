package com.hp.grcoeryshop.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	@NotBlank(message = "first name is required")
	private String firstName;
	
	@NotBlank(message = "last name is required")
	private String lastName;
	
	@NotNull(message = "contact is required")
	private long contact;
	
	@Email(message = "provide a proper email")
	@NotBlank(message = "email is required")
	private String email;
	
	@NotBlank(message = "gender is required")
	private String gender;
	
	@Past(message = "you can provide today's date")
	private LocalDate dob;
	
	@NotBlank(message = "username is required")
	private String username;
	
	@NotBlank(message = "password is required")
	@Size(min = 8)
	private String password;
}
