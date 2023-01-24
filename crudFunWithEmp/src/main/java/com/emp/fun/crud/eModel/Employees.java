package com.emp.fun.crud.eModel;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="employees")
public class Employees {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="empId")
	private int empId;
   @Column(name="name")
	private String name;
   @Column(name="address")
	private String address;
   @Column(name="date")
   @Temporal(TemporalType.DATE)
	private Date dob;
   @Column(name="salary")
	private int salary;
   @Column(name="roll")
	private String roll;
	
	
	public Employees() {
		
	}
	
	
	public Employees(int empId, String name, String address, Date dob, int salary, String roll) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.salary = salary;
		this.roll = roll;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}


	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", name=" + name + ", address=" + address + ", dob=" + dob + ", salary="
				+ salary + ", roll=" + roll + "]";
	}
	 
	
	
}
