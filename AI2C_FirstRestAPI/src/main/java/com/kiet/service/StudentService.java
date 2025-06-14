package com.kiet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.model.Student;
import com.kiet.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	
	}

	public List<Student> retrieveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Student retrieveById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	public void removebyid(int id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
	}
	

}
