package com.it.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.app.entity.AppEntity;

public interface AppRepository extends JpaRepository<AppEntity, String> {

}
