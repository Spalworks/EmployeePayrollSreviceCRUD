package com.bridgelabz.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.employeepayrollapp.entity.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
