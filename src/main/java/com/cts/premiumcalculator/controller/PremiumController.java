package com.cts.premiumcalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	@PostMapping("/addRules")
	public void addRules(@RequestBody Rule rule) {
		premiumService.save(rule); 
	}

	@PostMapping("/addHealthDetails")
	public void addHealthDetails(@RequestBody HealthDetails healthDetails) {
		premiumService.save(healthDetails); 
	}

	@PostMapping("/addVehicleDetails")
	public void addVehicleDetails(@RequestBody VehicleDetails vehicleDetails) {
			premiumService.save(vehicleDetails);
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
	
	@DeleteMapping(value="/deleteplanbyid/{id}")
    public Plans deleteplanbyid(@PathVariable("id") int id) {
        Plans plans =  premiumService.deletePlansById(id);
        return plans;
    }
    @DeleteMapping(value="/deleteproductsbyid/{id}")
    public Products deleteproductsbyid(@PathVariable("id") int id) {
        Products products =  premiumService.deleteProductsById(id);
        return products;
    }
    @DeleteMapping(value="/deleterulesbyid/{id}")
    public Rule deleterulesbyid(@PathVariable("id") int id) {
        Rule rules =  premiumService.deleteRulesById(id);
       return rules;
    }
}
