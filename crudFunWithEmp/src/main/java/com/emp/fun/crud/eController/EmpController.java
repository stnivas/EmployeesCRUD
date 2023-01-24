package com.emp.fun.crud.eController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.fun.crud.eModel.Employees;
import com.emp.fun.crud.eServiceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/v1/employees")
public class EmpController {
	@Autowired
  private EmployeeServiceImpl empService; 

	@PostMapping
	public String createEmp(@RequestBody Employees emp) {
		return empService.createEmployee(emp);
	}
	@GetMapping
	public List<Employees>getAllemployeeInfo(){
		return empService.getAllEmployeeDetails();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employees>getEmployeeDetailsById(@RequestParam("id")int empId){
		Optional<Employees> op=empService.getEmployeeDetailsById(empId);
		if(op.isPresent()) {
			return new ResponseEntity<>(op.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping
	public String updateEmpInfo(@RequestBody Employees emp) {
	return empService.updateEmployeeDetails(emp);
	}
	@DeleteMapping
	public String deleteEmpInfo(@RequestParam("empId")int empId) {
		return empService.DeleteEmployeeDetails(empId);
	}
}
