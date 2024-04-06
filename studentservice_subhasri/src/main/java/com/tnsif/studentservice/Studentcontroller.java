package com.tnsif.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
	@Autowired
	private Studentservice service;
	@PostMapping("/studentservice")
	public void add(@RequestBody Student stud) {
		service.save(stud);
	}
	@GetMapping("/studentservice") 
	public List<Student>ShowAll() 
	{
		return service.getAllRecords(); 
	}
	
	@GetMapping("/studentservice/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return service.getStudentById(id);
	}
	@DeleteMapping("/studentservice/{id}") 
	public void deleteStudent(@PathVariable Integer id) {
		service.deleteStudent(id);
		
	}
	@PutMapping("/studentservice/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable Integer id,@RequestBody Student updatedStudent) {
		service.updateStudent(id,updatedStudent);
		return ResponseEntity.ok("Student updated Successfully");
	}
	

}
