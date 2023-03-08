package com.bridgelabz.employeepayrollapp.entity;

//import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, String profilePic, String gender, List<String> department, long salary,
			String note, Date startDate) {
		super();
		this.id = id;
		this.name = name;
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.note = note;
		this.startDate = startDate;
	}

	public Employee(Employee employee) {
		this.name = employee.getName();
		this.profilePic = employee.getProfilePic();
		this.gender = employee.getGender();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.note = employee.getNote();
		this.startDate = employee.getStartDate();
		
	}

	public Employee(int id2, Employee employee) {
		this.id = id2;
		this.name = employee.getName();
		this.profilePic = employee.getProfilePic();
		this.gender = employee.getGender();
		this.department = employee.getDepartment();
		this.salary = employee.getSalary();
		this.note = employee.getNote();
		this.startDate = employee.getStartDate();
	}

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", profilePic=" + profilePic + ", gender=" + gender
				+ ", department=" + department + ", salary=" + salary + ", note=" + note + ", startDate=" + startDate
				+ "]";
	}

}
