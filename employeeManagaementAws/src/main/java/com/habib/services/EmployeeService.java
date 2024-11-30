package com.habib.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habib.entity.Employee;
import com.habib.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	

	public Employee  saveEmployee(Employee employs) {
		
		
		
		return employeeRepository.save(employs);
	}
		
		public List<Employee> getAllEmployee(){
			
			 List<Employee> allEmployee = employeeRepository.findAll();
			 
			 return allEmployee;
			
	}
	
	
	

}
