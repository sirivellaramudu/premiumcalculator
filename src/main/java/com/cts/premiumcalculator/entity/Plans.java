package com.cts.premiumcalculator.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Plans {
	
	
	@OneToMany(cascade = CascadeType.ALL,
     mappedBy = "plans")
   private List<Products> products = new ArrayList<>();
	@Id
	private int plan_id;
	private String plan_name;
	private int tenure;
	private Date monthly_due_date;
	private Date plan_start_date;
	private Date plan_end_date;
	private int premium;
	
	

}
