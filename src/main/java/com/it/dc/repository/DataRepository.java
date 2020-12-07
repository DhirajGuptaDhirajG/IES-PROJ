package com.it.dc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.app.entity.AppEntity;

public interface DataRepository extends JpaRepository<AppEntity, String> {

}
