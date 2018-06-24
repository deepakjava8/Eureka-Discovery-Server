package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
@RequestMapping("/api")
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
	
	@RequestMapping(value = "/secondEmployee", method = RequestMethod.GET)
	public Employee secondPage() {

		Employee emp = new Employee();
		emp.setName("emp2");
		emp.setDesignation("manager-2");
		emp.setEmpId("2");
		emp.setSalary(5000);

		return emp;
	}

}
