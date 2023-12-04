package com.hp.grcoeryshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hp.grcoeryshop.entity.PurchaseEntity;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity, Long>{

}
