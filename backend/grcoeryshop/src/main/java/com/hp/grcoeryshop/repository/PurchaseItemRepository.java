package com.hp.grcoeryshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hp.grcoeryshop.entity.PurchaseItemEntity;

@Repository
public interface PurchaseItemRepository extends JpaRepository<PurchaseItemEntity, Long>{

	public List<PurchaseItemEntity> findByPurchaseid(Long purchaseid);
}
