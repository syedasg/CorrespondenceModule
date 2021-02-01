package com.ashokeit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokeit.entities.BatchRunDetails;

public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails,Serializable> {

}
