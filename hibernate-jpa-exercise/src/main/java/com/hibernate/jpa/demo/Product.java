package com.hibernate.jpa.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@Column(name="name")
	private String name; 
	
	@Column(name="category")
	private String category;
	
	@Column(name="price")
	private Double price;
	
	@ManyToMany(cascade= CascadeType.ALL)
	private List<Order> orders= new ArrayList<Order>();
	
	
	
	
}
