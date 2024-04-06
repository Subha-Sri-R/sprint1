package com.tnsif.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Studentservice {
	@Autowired
      private Studentrepository repo;
      //to insert the record 
      public void save(Student stud) {
    	  repo.save(stud);
      }
      //show all the records
      public List<Student>getAllRecords()
      {
    	  return repo.findAll();
      }
      //show specific record from the table
      public Student getStudentById(Integer id) {
    	  return repo.findById(id).orElse(null);
    	  
      }
      //deleting the specific record from the table
      public void deleteStudent(Integer id) {
    	  repo.deleteById(id);
      }
      //updating the existing record
      public void updateStudent(Integer id,Student updateStudent) {
    	  Student existingStudent=repo.findById(id).orElse(null);
    	  if(existingStudent!=null) {
    		  existingStudent.setAge(updateStudent.getAge());
    		  existingStudent.setDept(updateStudent.getDept());
    		  existingStudent.setGender(updateStudent.getGender());
    		  existingStudent.setGrade(updateStudent.getGrade());
    		  existingStudent.setMarks(updateStudent.getMarks());
    		  existingStudent.setSid(updateStudent.getSid());
    		  existingStudent.setSname(updateStudent.getSname());
    		  repo.save( existingStudent);
    	  }
      }

}
