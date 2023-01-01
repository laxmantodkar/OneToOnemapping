package com.mapping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Student findById(int id);
	
	
	
}