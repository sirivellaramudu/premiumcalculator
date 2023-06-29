package com.cts.premiumcalculator.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Products {
	
	@Id
	private int product_id;
	private String product_name;
	private String product_description;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "plan_id")
	private Plans plans;

}
