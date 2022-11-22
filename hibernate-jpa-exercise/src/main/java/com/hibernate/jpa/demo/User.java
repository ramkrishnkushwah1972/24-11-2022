package com.hibernate.jpa.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private long id;
	
	@Column (name = "fullname")
	private String fullname;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "password")
	private String password;

	public User() {
		super();
	}

	public User(long id, String fullname, String email, String password) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
