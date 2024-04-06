package com.tnsif.studentservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository <Student,Integer> {
	

}
