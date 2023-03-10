package com.bridgelabz.employeepayrollapp.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

	@Pattern(regexp = "^[A-Z]{1}[A-Za-z]{2,}$", message = "Invalid Name")
	@NotEmpty(message = "Name should not be null")
	private String name;
	
	@NotBlank(message = "Profile pic should not be Empty")
	private String profilePic;
	
	@Pattern(regexp = "male|female", message = "Gender should be either male or female")
	private String gender;
	
	
	private List<String> department;
	
	
	@Min(value = 300000, message = "Salary should be more than 300000")
	@Max(value = 900000, message = "Salary should not exceeds 900000")
	private long salary;
	
	
	private String note;
	
	
//	@Pattern(regexp = "dd-MM-yyyy")
	@NotNull(message = "Start Date should not be empty")
	private Date startDate;
	
}
