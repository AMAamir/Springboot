package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private long rollnumber;
	private String name;
	private String classname;
	private String address;
	public Student(long rollNumber, String name, String classname, String address) {
		super();
		this.rollnumber = rollNumber;
		this.name = name;
		this.classname = classname;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getRollNumber() {
		return rollnumber;
	}
	public void setRollNumber(long rollNumber) {
		this.rollnumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollnumber + ", name=" + name + ", classname=" + classname + ", address="
				+ address + "]";
	}
	

}
