package com.it.dc.response;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN_TAB")
public class Citizen implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
