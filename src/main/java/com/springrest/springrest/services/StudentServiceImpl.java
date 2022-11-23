package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.StudentDao;
import com.springrest.springrest.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public StudentServiceImpl() {
		 
	}

	@Override
	public List<Student> getStudent() {
		 
		return studentDao.findAll();
	}

	 
	@Override
	public Student getStudent(long rollNumber) {
		return studentDao.findById(rollNumber).get();
	}

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student); 
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student); 
		return student; 
	}

	@Override
	public void deleteStudent(long rollNumber) {
		 Student entity=studentDao.getOne(rollNumber);
		 studentDao.delete(entity);
		
	}

}
