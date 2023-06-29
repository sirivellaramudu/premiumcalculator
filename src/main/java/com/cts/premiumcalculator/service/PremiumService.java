package com.cts.premiumcalculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.premiumcalculator.entity.HealthDetails;
import com.cts.premiumcalculator.entity.Plans;
import com.cts.premiumcalculator.entity.Products;
import com.cts.premiumcalculator.entity.Rule;
import com.cts.premiumcalculator.entity.VehicleDetails;
import com.cts.premiumcalculator.repository.HealthDetailsRepository;
import com.cts.premiumcalculator.repository.PlanRepository;
import com.cts.premiumcalculator.repository.PremiumRepository;
import com.cts.premiumcalculator.repository.RulesRepository;
import com.cts.premiumcalculator.repository.VehicleDetailsRepository;

@Service
public class PremiumService {

	@Autowired
	PremiumRepository premiumRepository; 

	@Autowired
	PlanRepository planRepository;

	@Autowired
	RulesRepository rulesRepository;

	@Autowired
	VehicleDetailsRepository vehicleDetailsRepository;

	@Autowired
	HealthDetailsRepository healthDetailsRepository;


	public List<Products> getAllProducts() {
		return premiumRepository.findAll();
	}

	public List<Plans> getAllPlans() {
		return planRepository.findAll();
	}

	public List<Rule> getAllRules() {
		return rulesRepository.findAll();
	}

	public List<VehicleDetails> getAllVehicleDetails() {
		return vehicleDetailsRepository.findAll();
	}

	public List<HealthDetails> getAllHealthDetails() {
		return healthDetailsRepository.findAll();
	}

	public Plans save(Plans plans) {
		return planRepository.save(plans);
	}
	public Products save(Products products) {
		return premiumRepository.save(products);
	}


	public Products updateStatus(int id, String description, String name) {

		Products products = premiumRepository.findById(id).orElse(null);

		if(products!=null) {

			products.setProduct_description(description);

			products.setProduct_name(name);

			premiumRepository.save(products);

			return products;

		}

		return null;

	}



	public Plans updatePlans(Plans plans1) {

		Plans plans = planRepository.findById(plans1.getPlan_id()).orElse(null);

		if(plans!=null) {

			plans1.setPlan_id(plans1.getPlan_id());

			plans1.setPlan_name(plans1.getPlan_name());

			plans1.setPlan_start_date(plans1.getPlan_start_date());

			plans1.setPlan_end_date(plans1.getPlan_end_date());

			plans1.setMonthly_due_date(plans1.getMonthly_due_date());

			plans1.setPremium(plans1.getPremium());

			plans1.setTenure(plans1.getTenure());

			planRepository.save(plans1);

			return plans1;

		}

		return null;

	}



	public Rule updateRules(Rule rules1) {

		Rule rules = rulesRepository.findById(rules1.getRule_id()).orElse(null);

		if(rules!=null) {

			rules1.setRule_id(rules1.getRule_id());

			rules1.setRule_name(rules1.getRule_name());

			rulesRepository.save(rules1);

			return rules1;

		}

		return null;

	}

}
