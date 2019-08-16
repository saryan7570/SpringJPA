package com.cg.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.jpa.dao.EmployeeDAO;
import com.cg.jpa.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public Employee save(Employee employee) {
		employeeDAO.save(employee);
		return employee;
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
