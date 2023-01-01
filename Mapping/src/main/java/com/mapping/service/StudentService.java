package com.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.entities.Student;
import com.mapping.entities.Training;
import com.mapping.repository.StudentRepository;
import com.mapping.repository.TrainingRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TrainingRepository trainingRepository;
  //add Student
	public String addStudent(Student student)
	{

		try {
			studentRepository.save(student);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return "Add Successfully";
	}
	
	//Get student
	
	public List<Student> getStudent()
	{
		List<Student>  studentget=null;
		try {
			
			studentget=studentRepository.findAll();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return studentget;
		
	}
	//assing Training
	public void assignTraining(Student student)
	{
		Student dbStudent = studentRepository.findById(student.getId());
		Training dbTraining = trainingRepository.findById(student.getTraining().getId());
		dbStudent.setTraining(dbTraining);
		studentRepository.save(dbStudent);
		
	}
	
	
}
