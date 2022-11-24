package com.hibernate.jpa.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="tier")
	private int tier;
	
	@OneToMany
	private Product product; 
	
	
}
