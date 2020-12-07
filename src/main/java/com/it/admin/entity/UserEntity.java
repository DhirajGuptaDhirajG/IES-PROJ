package com.it.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER_TAB")
public class UserEntity {
	

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String pwd;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="GENDER")
	private Character gender;
	
	@Column(name="SSN")
	private String ssn;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="ROLE")
	private String role;

	@Column(name="STATUS")
	private String status;
	
	@Column(name="USER_PWD")
	private String userPwd;
}