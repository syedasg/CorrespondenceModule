package com.ashokeit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokeit.entities.EligibilityDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetails,Serializable> {

}
