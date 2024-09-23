package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends Person {
	
	private String department;
	private double salary;
	
		// 1. Constructor Employee
	public Employee(String name, int age, String email, String rfc, 
							String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	}//constructor
	
		// 2. Getters and Setters
	public String getDepartment() {
		return department;
	}//getDepartmen
	public void setDepartment(String department) {
		this.department = department;
	}//setDepartment
	public double getSalary() {
		return salary;
	}//getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary

		// 3. toString()
	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", gtRfc()=" + gtRfc() + ", getEmail()=" + getEmail()
				+ ", getAge()=" + getAge() + ", getId()=" + getId() + "]";
	}//toString

	@Override
	public void setRfc(String rfc) {
		Pattern regex = Pattern.compile("^[A-ZÑ]{4}[0-9]{6}[A-Z0-9]{3}$");//Definir expresion regular 
		Matcher m = regex.matcher(rfc);
		if(m.matches()) {
			this.rfc=rfc;
		}//if
	}//setRfc
	
}//class Employee

