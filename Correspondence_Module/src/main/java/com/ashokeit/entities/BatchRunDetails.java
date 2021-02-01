package com.ashokeit.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BATCH_RUN_DTLS")
@Data
public class BatchRunDetails {
	@Id
	@GeneratedValue
	@Column(name="BATCH_RUN_SEQ")
	protected Integer batchRunSeq;
	@Column(name="BATCH_NAME")
	protected String batchName;
	@Column(name="BATCH_RUN_STATUS")
	protected String batchRunStatus;
	@Column(name="END_DATE")
	protected Date endDate;
	@Column(name="INSTANCE_NUM")
	protected Integer instanceNum;
	@Column(name="START_DATE")
	protected Date startDate;
	
}
