package com.it.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PLANS_TAB")
public class PlanEntity{

	@Id
	@Column(name="PLAN_ID")
	@GeneratedValue
	private Integer pid;
	
	@Column(name="PLAN_NAME")
	private String planName;

	@Column(name="PLAN_DESC")
	private String planDesc;


	@Column(name="PLAN_START_DATE")
	private String planStartDate;


	@Column(name="PLAN_END_DATE")
	private String planEndDate;


}
