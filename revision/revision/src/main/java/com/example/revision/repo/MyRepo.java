package com.example.revision.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.revision.entity.Student;
@Repository
public interface MyRepo extends JpaRepository<Student, Integer> {

	
}
