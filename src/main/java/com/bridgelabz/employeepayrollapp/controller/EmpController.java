package com.bridgelabz.employeepayrollapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.service.EmpService;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmpController {

	@Autowired
	EmpService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllEmp() {
		
		List<Employee> result = service.getAllEmployee();
		if(result.size() != 0) {
			return new ResponseEntity(result, HttpStatus.OK);
		} 
		return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getUEmp(@PathVariable int id) {

		Employee result = service.getEmployee(id);
		if(result != null) {
			return new ResponseEntity<Employee>(result, HttpStatus.OK);
		} 
			return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	}

	@PostMapping("/create")
	public Employee addEmp(@RequestBody EmployeeDTO employee) {
		Employee response = service.createUser(employee);
		return response;
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmp(@PathVariable int id, @RequestBody EmployeeDTO employee) {
		Employee response = service.updateEmployee(id, employee);
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteUserById(id);
	}
}
