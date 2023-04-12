package com.example.revision.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.revision.entity.Student;
import com.example.revision.repo.MyRepo;

@Service
public class MyService {
     
	@Autowired
	private MyRepo myrepo;
	 
	public Optional<Student> getStudent(int id)
	{
		Optional<Student> stu =myrepo.findById(id);
		return stu;
		
	}

	public void saveData(Student stu) {
		myrepo.save(stu);
		
	}

	public void deleteData(int id) {
		
		myrepo.deleteById(id);
		
	}

	public List<Student> getAllStudent(int id) {
		
		return null;
	}

	public List<Student> getAllSTudent() {
		List<Student> stu= myrepo.findAll();
		
		return stu;
		
	}
	
	
}
