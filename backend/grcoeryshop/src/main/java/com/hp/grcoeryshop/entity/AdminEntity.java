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
public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adminId;
	
	@NotBlank(message = "First name is required")
	private String firstName;
	
	@NotBlank(message = "last name is required")
	private String lastName;
	
	@NotNull(message = "contact is required")
//	@Pattern(regexp = "^[0-9]+$", message = "contact shpuld contain only numbers")
//	@Range(max = 11)
	private long contactNo;
	
	@Email(message = "provide a proper email")
	@NotBlank(message = "email is required")
	private String email;
	
	@NotBlank(message = "gender is required")
	private String gender;
	
	@Past(message = "you can add today date")
	private LocalDate dob;
	
	@NotBlank(message = "username is required")
	private String username;
	
	@NotBlank(message = "password is required")
	@Size(min = 8)
	private String password;

}
