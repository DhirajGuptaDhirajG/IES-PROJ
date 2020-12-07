package com.it.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.co.entity.BatchDtlEntity;

public interface BatchDtlRepository extends JpaRepository<BatchDtlEntity,Serializable>{

}
