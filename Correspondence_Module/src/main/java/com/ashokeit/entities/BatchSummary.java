package com.ashokeit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BATCH_SUMMARY")
@Data
public class BatchSummary {
  @Id
  @GeneratedValue
  @Column(name="SUMMARY_ID")
  protected Integer summaryId;
  @Column(name="BATCH_NAME")
  protected String batchName;
  @Column(name="FAILURE_TRIGGER_COUNT")
  protected Integer failureTriggerCount;
  @Column(name="SUCCESS_TRIGGER_COUNT")
  protected Integer succcessTriggerCount;
  @Column(name="TOTAL_TRIGGER_PROCESSED")
  protected Integer totalTriggerProcessed;       
    
}
