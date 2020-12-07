package com.it.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.admin.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{


	
	/*
	 * //find user by email public UserEntity findByEmail(String email); //find user
	 * by email and pasword public UserEntity findByEmailAndPwd(String email,String
	 * pwd);
	 */
	 
	 
	 
	
}
