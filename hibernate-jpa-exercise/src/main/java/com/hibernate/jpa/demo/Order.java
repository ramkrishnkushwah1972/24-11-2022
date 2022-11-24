package com.hibernate.jpa.demo;

import java.time.LocalDate;
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
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="orderDate")
	private LocalDate orderDate;
	
	@Column(name="deliveryDate")
	private LocalDate deliveryDate;
	
	@ManyToMany(cascade= CascadeType.ALL)
	List<Product> products = new ArrayList<Product>();
	
	private Customer customer;
	
}
