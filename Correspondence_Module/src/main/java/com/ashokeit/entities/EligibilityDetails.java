package com.ashokeit.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	@Id
	@GeneratedValue
	@Column(name="ED_TRACE_ID_NUMBER")
	protected Integer edTraceIdNum;
	@Column(name="BENEFIT_AMT")
	protected String benefitAmt;
	@Column(name="CASE_NUM")
	protected Integer caseNumber;
	@Column(name="CREATE_DT")
	protected Date createDate;
	@Column(name="DENIAL_REASON")
	protected String denailReason;
	@Column(name="PLAN_END_DT")
	protected String planEndDate;
	@Column(name="PLAN_NAME")
	protected String planName;
	@Column(name="PLAN_START_DT")
	protected String planStartDate;
	@Column(name="PLAN_STATUS")
	protected String planStatus;
	@Column(name="UPDATE_DT")
	protected Date updateDate;


}
