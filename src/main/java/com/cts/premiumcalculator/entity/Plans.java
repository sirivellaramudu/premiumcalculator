package com.cts.premiumcalculator.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Plans {

	@Id
	private int plan_id;
	private String plan_name;
	private double plan_value;
	private int tenure;
	private Date monthly_due_date;
	private Date plan_start_date;
	private Date plan_end_date;
	private int premium;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	@JsonIgnore
	private Products products;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "name")
	@JsonIgnore
	private HealthDetails healthdetails;


}
