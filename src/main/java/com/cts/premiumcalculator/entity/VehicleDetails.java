package com.cts.premiumcalculator.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class VehicleDetails {
	
	private String u_name ;
	private int u_contact; 
	private String v_name; 
	@Id
	private String model;
	private Date year_of_purchase;


}
