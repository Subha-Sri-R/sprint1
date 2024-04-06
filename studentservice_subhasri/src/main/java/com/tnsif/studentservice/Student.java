package com.tnsif.studentservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="marks")
	private int marks;
	@Column(name="dept")
	private String dept;
	@Column(name="gender")
	private char gender;
	@Column(name="age")
	private int age;
	@Column(name="grade")
	private String grade;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int marks, String dept, char gender, int age, String grade) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.dept = dept;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", dept=" + dept + ", gender=" + gender
				+ ", age=" + age + ", grade=" + grade + "]";
	}
	
	

}
