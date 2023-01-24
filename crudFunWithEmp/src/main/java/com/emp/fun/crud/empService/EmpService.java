package com.emp.fun.crud.empService;

import java.util.List;
import java.util.Optional;

import com.emp.fun.crud.eModel.Employees;

public interface EmpService  {

	public String createEmployee(Employees emp);
	public List<Employees> getAllEmployeeDetails();
	public Optional<Employees>getEmployeeDetailsById(int empId);
	public String updateEmployeeDetails(Employees emp);
	public String DeleteEmployeeDetails(int id);
}
