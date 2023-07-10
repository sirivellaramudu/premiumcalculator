package com.cts.premiumcalculator.entity;

import java.util.Date;
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
	@OneToMany(mappedBy = "healthdetails", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Plans> plans;

}
