package com.it.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.co.entity.CoPdfEntity;


public interface CoPdfRepository extends JpaRepository<CoPdfEntity,Serializable>{

}
