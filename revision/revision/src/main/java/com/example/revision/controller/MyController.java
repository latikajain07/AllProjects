package com.example.revision.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.revision.entity.Student;
import com.example.revision.service.MyService;

@RestController
public class MyController {
	
	@Autowired 
	private MyService myService;
	
	@GetMapping("/getdata/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id)
	{
		  Optional<Student> stu= myService.getStudent(id);
		  return stu;
		
	}
	
	@PostMapping("/saveData")
	public void save(@RequestBody Student stu)
	{
		myService.saveData(stu);
		
	}
	
	@DeleteMapping("/Deletedata/{id}")
	public void deleteData(@PathVariable("id")int id)
	{
		myService.deleteData(id);
	}
	
	@GetMapping("/getAlldata")
	public List<Student> getAllStudent()
	{
		List<Student> stu=myService.getAllSTudent();	  
		return stu;
	}
	
	
}
