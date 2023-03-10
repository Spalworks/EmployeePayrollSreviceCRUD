package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.entity.Employee;

public interface IEmpService {

	List<Employee> getAllEmployee();

	Employee getEmployee(int id);

	Employee createUser(EmployeeDTO employee);

	Employee updateEmployee(int id, EmployeeDTO employee);

	void deleteUserById(int id);

}
