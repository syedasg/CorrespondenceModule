package com.ashokeit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokeit.entities.CoPdfs;

public interface CoTriggersRepository extends JpaRepository<CoPdfs,Serializable> {

}
