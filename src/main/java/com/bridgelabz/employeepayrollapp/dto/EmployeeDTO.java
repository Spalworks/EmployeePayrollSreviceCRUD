package com.bridgelabz.employeepayrollapp.dto;

import java.util.Date;
import java.util.List;

public class EmployeeDTO {

	private String name;
	private String profilePic;
	private String gender;
	private List<String> department;
	private long salary;
	private String note;
	private Date startDate;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(String name, String profilePic, String gender, List<String> department, long salary, String note,
			Date startDate) {
		super();
		this.name = name;
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.note = note;
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", profilePic=" + profilePic + ", gender=" + gender + ", department="
				+ department + ", salary=" + salary + ", note=" + note + ", startDate=" + startDate + "]";
	}
	
	
}
