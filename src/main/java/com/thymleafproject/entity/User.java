package com.thymleafproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
@Table(name ="userregister")
public class User {

	private String name;
	
	@Id
	private String username;
	private String email;
	private String phoneNumber;
	private String pasword;
	private String cpassword;
	private String gender;
	
}