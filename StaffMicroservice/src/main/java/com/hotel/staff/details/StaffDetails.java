package com.hotel.staff.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StaffDetails")
public class StaffDetails {
	
	public StaffDetails(String code, String employeename, String employeeaddress, String age, String salary,
			String occupation, String email) {
		super();
		this.code = code;
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.age = age;
		this.salary = salary;
		this.occupation = occupation;
		this.email = email;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Id
 	private String code;
    private String employeename;
    private String employeeaddress;
    private String age;
	private String salary;
    private String occupation;
    private String email;
}
