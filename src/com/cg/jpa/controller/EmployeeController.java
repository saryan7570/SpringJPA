package com.cg.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.jpa.entity.Employee;
import com.cg.jpa.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService; 
	
	@RequestMapping("/index")
	public String getHomePage(Model model) {
		model.addAttribute("designation", new String[] {"System Associate", "Deputy Manager", "Consultant", "Team Leader"});
		model.addAttribute("employee", new Employee());
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveEmployee(Employee employee, Model model) {
		employee = employeeService.save(employee);
		return "redirect:/index.html";
	}
}