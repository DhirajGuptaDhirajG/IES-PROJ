package com.it.co.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="CO_TRIGGERS")
public class TriggerEntity {
		
		@Id
		@Column(name=" TRG_ID")
		@GeneratedValue
		Integer trg_id;
		
		@Column(name="CASE_NUM")
		Integer case_num;
		
		@CreationTimestamp
		@Column(name=" CREATE_DT")
		Date create_date;
		
		
		@Column(name=" TRG_STATUS")
		String trg_status;
		
		@UpdateTimestamp
		@Column(name=" UPDATE_DT")
		Date update_dt;	
		
}


