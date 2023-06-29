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
public class HealthDetails {
	@Id
	private String name ;
	private Date  dob;
	private String address;
	private int contact;
	private int age; 
	private String gender;
	private float height; 
	private float weight;  
	private int bpm;

}
