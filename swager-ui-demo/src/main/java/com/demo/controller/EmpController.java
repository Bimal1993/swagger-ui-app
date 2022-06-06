package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.DemoService;

@RestController
public class EmpController {

	@Autowired
	DemoService service;

	@GetMapping("/all")
	public List<Employee> getAll() {
		return service.getList();
	}

	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp) {
		System.out.println("Employee: " + emp);
		return emp;
	}
}
