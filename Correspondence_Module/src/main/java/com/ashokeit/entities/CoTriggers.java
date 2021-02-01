package com.ashokeit.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="CO_TRIGGERS")
@Data
public class CoTriggers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TRG_ID")
	protected Integer trgId;
	@Column(name="CASE_NUM")
	protected Integer caseNumber;
	@Column(name="CREATE_DT")
	protected Date createDate;
	@Column(name="TRG_STATUS")
	protected String trgStatus;
	@Column(name="UPDATE_DT")
	protected Date updateDate;

}
