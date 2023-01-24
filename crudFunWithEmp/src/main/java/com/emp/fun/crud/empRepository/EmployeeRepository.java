package com.emp.fun.crud.empRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.fun.crud.eModel.Employees;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
