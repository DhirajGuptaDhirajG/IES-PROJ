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
@Table(name="Eligibility_Details")
public class EligeEntity {
	
	@Id
	@Column(name=" ED_TRACE_ID")
	@GeneratedValue
	Integer ed_trace_id;
	
	@Column(name="BENEFIT_AMT")
    String benefit_amt;
    
    @Column(name=" CASE_NUM")
    Integer case_num;
    
    @CreationTimestamp
    @Column(name=" CREATE_DT")
    Date create_dt;
    
    @Column(name="DENIAL_REASON")
    String denial_reason;
    
    
    @Column(name=" PLAN_END_DT")
    Date plan_end_dt;
    
    @Column(name="PLAN_NAME")
    String plan_name;
    
    @CreationTimestamp
    @Column(name="PLAN_START_DT")
    Date plan_start_dt;
    
    @Column(name="PLAN_STATUS")
    String plan_status;
    
    @UpdateTimestamp
    @Column(name="UPDATE_DT")
    Date update_dt;
}
