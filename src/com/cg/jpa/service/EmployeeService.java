package com.cg.jpa.service;

import java.util.List;
import com.cg.jpa.entity.Employee;

public interface EmployeeService {

	public abstract Employee save(Employee employee);
	
	public abstract List<Employee> loadAll();
	
}