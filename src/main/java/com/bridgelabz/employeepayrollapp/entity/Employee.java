package com.bridgelabz.employeepayrollapp.entity;

//import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	int id;

	private String name;
	private String profilePic;
	private String gender;
	private List<String> department;
	private long salary;
	private String note;
	private Date startDate;
//	private LocalDate startDate = java.time.LocalDate.now();


//	public Employee(Employee employee) {
//		this.name = employee.getName();
//		this.profilePic = employee.getProfilePic();
//		this.gender = employee.getGender();
//		this.department = employee.getDepartment();
//		this.salary = employee.getSalary();
//		this.note = employee.getNote();
//		this.startDate = employee.getStartDate();
//		
//	}

//	public Employee(int id2, Employee employee) {
//		this.id = id2;
//		this.name = employee.getName();
//		this.profilePic = employee.getProfilePic();
//		this.gender = employee.getGender();
//		this.department = employee.getDepartment();
//		this.salary = employee.getSalary();
//		this.note = employee.getNote();
//		this.startDate = employee.getStartDate();
//	}

	public Employee(EmployeeDTO employee) {
		this.name = employee.getName();
		this.profilePic = employee.getProfilePic();
		this.gender = employee.getGender();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.note = employee.getNote();
		this.startDate = employee.getStartDate();
	}

	public Employee(int id2, EmployeeDTO employee) {
		this.id = id2;
		this.name = employee.getName();
		this.profilePic = employee.getProfilePic();
		this.gender = employee.getGender();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.note = employee.getNote();
		this.startDate = employee.getStartDate();
	}

}
