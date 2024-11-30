package com.habib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.habib.entity.Employee;
import com.habib.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	
	@PostMapping("/save-emp")
	public ResponseEntity<Employee> createEmployeee(@RequestBody Employee employee){
		
		Employee saveEmployee = employeeService.saveEmployee(employee);
		
		return ResponseEntity.ok(saveEmployee);
	}
	
	@GetMapping("/get-all-emp")
	public ResponseEntity<List<Employee>> findallEmployee(){
		List<Employee> getAllEmp = employeeService.getAllEmployee();
		
		return ResponseEntity.ok(getAllEmp);
	}

}
