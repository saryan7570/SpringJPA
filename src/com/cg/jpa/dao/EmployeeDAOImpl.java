package com.cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.jpa.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Employee save(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public List<Employee> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
