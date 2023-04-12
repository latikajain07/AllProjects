package com.demo.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.learn.entity.Employee;



public interface MyRepo extends JpaRepository<Employee, Integer> {
	
//	public abstract Employee findById(int id);
    
}
