package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Student;

public interface StudentService {
	public List<Student> getStudent();
	public Student getStudent(long rollNumber);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(long rollNumber);
}
