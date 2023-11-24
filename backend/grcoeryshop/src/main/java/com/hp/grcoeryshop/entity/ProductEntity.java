package com.hp.grcoeryshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	@NotBlank(message = "product name is required")
	private String productName;
	
	@NotNull(message = "quantity is required")
	private int productQuantity;
	
	@NotNull(message = "price is required")
	private int productPrice;
	
	@NotNull(message = "categoryId is required")
	private long categoryId;

}
