package com.demo.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.learn.entity.Employee;
import com.demo.learn.repo.MyRepo;



@Service
public class MyService {

@Autowired
private	MyRepo myRepo;
	
	public Optional<Employee> getEmployee(int id){
		
Optional<Employee> emp = myRepo.findById(id);
		
		return emp;
		
		
	}

	public void saveData(Employee emp) {
		myRepo.save(emp);
		
	}

	

	public void deleteData(int id) {
		myRepo.deleteById(id);
		
	}

	

	public List<Employee> getAllEmployee() {
		
		List<Employee> emp = myRepo.findAll();
		return emp;
	}
	

}
