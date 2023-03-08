package com.bridgelabz.employeepayrollapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepo;

@Service
public class EmpService {

	@Autowired
	EmployeeRepo repo;

	public List<Employee> getAllEmployee() {
		List<Employee> response = repo.findAll();
		return response;
	}

	public Employee getEmployee(int id) {
		Optional<Employee> response = repo.findById(id);
		return response.orElse(null);
	}

	public Employee createUser(EmployeeDTO employee) {
		Employee data = new Employee(employee);
//		BeanUtils.copyProperties(employee, data);
		repo.save(data);
		return data;
	}

//	public Employee updateEmployee(int id, Employee employee) {
//		Employee existEmployee = repo.findById(id).get();
//		existEmployee.setName(employee.getName());
//		existEmployee.setProfilePic(employee.getProfilePic());
//		existEmployee.setGender(employee.getGender());
//		existEmployee.setDepartment(employee.getDepartment());
//		existEmployee.setSalary(employee.getSalary());
//		existEmployee.setStartDate(employee.getStartDate());
//		existEmployee.setNote(employee.getNote());
//		repo.save(existEmployee);
//		return existEmployee;
//	}

	public Employee updateEmployee(int id, EmployeeDTO employee) {
		Optional<Employee> existEmployee = repo.findById(id);
		if(existEmployee.isPresent()) {
			 Employee existEmployee1 = repo.findById(id).get();
			existEmployee1 = new Employee(id, employee);
			repo.save(existEmployee1);
			return existEmployee1;
		}
		return null;
	}

	public String deleteUserById(int id) {
		repo.deleteById(id);
		return "User is deleted. Id : " + id;
	}

}
