package com.hp.grcoeryshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PurchaseItemEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemid;
	private long productId;
	private int productQuantity;
	private long purchaseid;
}
  