package com.cts.premiumcalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.premiumcalculator.entity.Products;

@Repository
public interface PremiumRepository extends JpaRepository<Products,Integer> {

	
}
