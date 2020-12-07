package com.it.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.admin.entity.PlanEntity;

public interface PlanRepository extends JpaRepository<PlanEntity,Serializable> {

}
