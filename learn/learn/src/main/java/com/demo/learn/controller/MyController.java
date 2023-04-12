package com.demo.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.learn.entity.Employee;
import com.demo.learn.service.MyService;


@RestController 
public class MyController {
	
@Autowired	
private MyService myService ;
    
 @GetMapping("/getData/{id}")
 public Optional<Employee> getEmployee(@PathVariable("id") int id )
   {
	 Optional<Employee> empl = myService.getEmployee(id);
      System.out.println(empl);
        return empl;
   
   }
 @PostMapping("/postData")
 
	 public void saveEmployee(@RequestBody Employee emp)
	 {
		 myService.saveData(emp);
	
	 }

 @DeleteMapping("/deleteData/{id}")
 
 public void deleteEmployee(@PathVariable("id") int id)
 {
	 myService.deleteData(id);
	 
 }
// @GetMapping("/getData/{id}")
// public List<Employee> getAllEmployee()
//   {
// 
//   	List<Employee> empl = myService.getAllEmployee();
//       return empl;
//       
//       
//    }	
 	
 }
 