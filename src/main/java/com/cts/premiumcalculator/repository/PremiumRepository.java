package com.cts.premiumcalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.premiumcalculator.entity.Products;

@Repository
public interface PremiumRepository extends CrudRepository<Products,Integer> {

	
}
