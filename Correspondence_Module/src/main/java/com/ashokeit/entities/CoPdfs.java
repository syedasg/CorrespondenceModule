package com.ashokeit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.jdbc.Blob;

import lombok.Data;

@Entity
@Table(name="CO_PDFS")
@Data
public class CoPdfs {
	@Id
	@GeneratedValue
	@Column(name="CO_PDF_ID")
	protected Integer coPdfId;
	@Column(name="PLAN_STATUS")
	protected String planStatus;
	@Column(name="CASE_NUMBER")
	protected Integer caseNumber;
	@Column(name="PDF_DOCUMENT")
	protected Blob pdfDocument;
	@Column(name="PLAN_NAME")
	protected String planName;
	
}
