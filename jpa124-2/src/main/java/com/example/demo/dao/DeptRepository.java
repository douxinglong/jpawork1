package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.User;

public interface DeptRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User>{

	
	
	//User findAllName();
	
	//
	@Modifying
	@Query(value="select u from User u where u.name=:name")
	 List <User>findaaaName(@Param("name") String name);



	
	

}
