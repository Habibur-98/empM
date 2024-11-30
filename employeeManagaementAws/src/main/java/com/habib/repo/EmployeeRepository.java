package com.habib.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.habib.entity.Employee;

 @Repository
 public interface EmployeeRepository extends JpaRepository <Employee, Long> {
	
	

}
