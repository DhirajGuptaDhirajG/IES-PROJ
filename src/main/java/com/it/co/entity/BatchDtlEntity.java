package com.it.co.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="BATCH_RUN_DTLS")
public class BatchDtlEntity {
	
	@Id
	@Column(name=" BATCH_RUN_SEQ")
	@GeneratedValue
	Integer batch_run_seq;
	
	@Column(name="BATCH_NAME")
    String batch_name;
    
    @Column(name=" BATCH_RUN_STATUS")
    String batch_run_status;
    
    @Column(name=" END_DATE")
    Date end_date;
    
    @Column(name=" INSTANCE_NUM")
    Integer instance_num;
    
    @CreationTimestamp
    @Column(name=" START_DATE")
    Date start_date;
    

}
