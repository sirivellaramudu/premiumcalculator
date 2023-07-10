package com.cts.premiumcalculator.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Products {
	
	@Id
	private int product_id;
	private String product_name;
	private String product_description;
	@OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
//	@JsonIgnore
	private List<Plans> plans;


}
