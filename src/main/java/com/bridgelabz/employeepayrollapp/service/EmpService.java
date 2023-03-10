package com.bridgelabz.employeepayrollapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepo;

@Service
public class EmpService implements IEmpService{

	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> response = repo.findAll();
		return response;
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> response = repo.findById(id);
		return response.orElse(null);
	}

	@Override
	public Employee createUser(EmployeeDTO employee) {
		Employee data = new Employee(employee);
//		BeanUtils.copyProperties(employee, data);
		repo.save(data);
		return data;
	}

	@Override
	public Employee updateEmployee(int id, EmployeeDTO employee) {
		Optional<Employee> existEmployee = repo.findById(id);
		if(existEmployee.isPresent()) {
			 Employee existEmployee1 = repo.findById(id).get();
			existEmployee1 = new Employee(id, employee);
			repo.save(existEmployee1);
			return existEmployee1;
		}else
		 throw new EmployeePayrollException("ID Not found");
	}

	@Override
	public void deleteUserById(int id) {
		repo.deleteById(id);
	}

	

}
