package com.ashokeit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokeit.entities.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary,Serializable> {

}
