package com.it.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN_TAB")
public class AppEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "APP_ID", strategy="com.it.app.generator.AppGenerator")
	@GeneratedValue(generator = "APP_ID")
	@Id
	@Column(name="APPID")
		private String id;
		
		@Column(name="FIRST_NAME")
		private String firstName;

		@Column(name="LAST_NAME")
		private String lastName;
		
		@Column(name="DOB")
		private Date dob;
		
		@Column(name="GENDER")
		private Character gender;
		
		@Column(name="STATUS")
		private String status;
		
		@Column(name="SSN")
		private String ssn;
		
		@Column(name="PHONE")
		private String phone;
		
		@Column(name="EMAIL")
		private String email;
		
}
