package com.it.co.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CO_PDFS")
public class CoPdfEntity {
	
	@Id
	@Column(name=" CO_PDF_ID")
	@GeneratedValue
	Integer co_pdf_id;
	
	@Column(name="PLAN_STATUS")
	String plan_status;
	
	@Column(name="CASE_NUMBER")
	String case_number;
	
	@Column(name="PDF_DOCUMENT")
	Blob pdf_document;
	
	@Column(name=" PLAN_NAME")
	String plan_name;

}
