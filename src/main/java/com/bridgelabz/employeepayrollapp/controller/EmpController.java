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
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.service.EmpService;
import com.bridgelabz.employeepayrollapp.service.IEmpService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmpController {

	@Autowired
	IEmpService service;
	
	@GetMapping("/")
	public ResponseEntity<ResponseDTO> getAllEmp() {
		
		List<Employee> result = service.getAllEmployee();
		ResponseDTO responseDTO = new ResponseDTO(result, "Data retrived Successfully");
		if(result.size() != 0) {
			return new ResponseEntity(result, HttpStatus.OK);
		} 
		return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getUEmp(@PathVariable int id) {

		Employee result = service.getEmployee(id);
		if(result != null) {
			ResponseDTO responseDTO = new ResponseDTO(result, "Data retrived Successfully");
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
		} 
			return new ResponseEntity(null,HttpStatus.NOT_FOUND);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmp(@Valid @RequestBody EmployeeDTO employee) {
		Employee response = service.createUser(employee);
		ResponseDTO responseDTO = new ResponseDTO(response, "Data saved successfully");
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateEmp(@PathVariable int id, @Valid @RequestBody EmployeeDTO employee) {
		Employee response = service.updateEmployee(id, employee);
		ResponseDTO responseDTO = new ResponseDTO(response, "Data updated successfully");
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(@PathVariable int id) {
		service.deleteUserById(id);
		ResponseDTO responseDTO = new ResponseDTO(null, "Data deleted successfully");
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
