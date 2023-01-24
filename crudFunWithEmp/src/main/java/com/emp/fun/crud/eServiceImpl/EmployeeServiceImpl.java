package com.emp.fun.crud.eServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.fun.crud.eModel.Employees;
import com.emp.fun.crud.empRepository.EmployeeRepository;
import com.emp.fun.crud.empService.EmpService;

@Service
public class EmployeeServiceImpl implements EmpService {
   
	@Autowired
	private EmployeeRepository empRop;
	
	public String createEmployee(Employees emp) {
		if(empRop.existsById(emp.getEmpId())) {
			return "employee is alrady prasent";
		}else {
			empRop.save(emp);
			return "successfuly create";
		}
	}
	@Override
	public List<Employees> getAllEmployeeDetails() {
		 return empRop.findAll();
	}
	@Override
	public Optional<Employees> getEmployeeDetailsById(int empId) {
		 if(empRop.existsById(empId)) {
			 return empRop.findById(empId);
		 }else {
			 return Optional.empty();
		 }
		
	}
	@Override
	public String updateEmployeeDetails(Employees emp) {
	    if(empRop.existsById(emp.getEmpId())) {
	    	empRop.save(emp);
	    	return "successfuly";
	    }else {
	    	return "employee id not fount";
	    }
	}
	@Override
	public String DeleteEmployeeDetails(int id) {
		if(empRop.existsById(id)) {
			empRop.deleteById(id);
			return id+"successfuly delete";
		}else {
			return"employee id not found int database";
		}
		
	}
}
