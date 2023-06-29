package com.cts.premiumcalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.premiumcalculator.entity.HealthDetails;
import com.cts.premiumcalculator.entity.Plans;
import com.cts.premiumcalculator.entity.Products;
import com.cts.premiumcalculator.entity.Rule;
import com.cts.premiumcalculator.entity.VehicleDetails;
import com.cts.premiumcalculator.service.PremiumService;

@RestController
public class PremiumController {

	@Autowired
	PremiumService premiumService;

	@GetMapping("/getAllProducts")
	public List<Products> getAllProducts(){
		return premiumService.getAllProducts();

	}

	@GetMapping("/getAllPlans")
	public List<Plans> getAllPlans(){
		return premiumService.getAllPlans();

	}

	@GetMapping("/getAllRules")
	public List<Rule> getAllRules(){
		return premiumService.getAllRules();

	}
	@GetMapping("/getAllVehicleDetails")
	public List<VehicleDetails> getAllVehicleDetails(){
		return premiumService.getAllVehicleDetails();

	}

	@GetMapping("/getAllHealthDetails")
	public List<HealthDetails> getAllHealthDetails(){
		return premiumService.getAllHealthDetails();

	}

	@PostMapping("/addPlans")
	public void addPlans(@RequestBody Plans plans) {
		premiumService.save(plans); 
	}

	@PostMapping("/addProducts")
	public void addProducts(@RequestBody Products products) {
		premiumService.save(products); 
	}

	@PutMapping(value="/updateproducts/{id}/{description}/{name}")
	public Products updateStatus(@PathVariable("id") int id, @PathVariable("description") String description, @PathVariable("name") String name) {

		Products products =  premiumService.updateStatus(id, description , name);

		return products;

	}

	@PutMapping(value="/updateplans")
	public Plans updatePlans(@RequestBody Plans plans) {

		Plans plans1 =  premiumService.updatePlans(plans);

		return plans1;

	}

	@PutMapping(value="/updaterules")
	public Rule updateRules(@RequestBody Rule rules) {

		Rule rules1 =  premiumService.updateRules(rules);

		return rules1;



	}
}
