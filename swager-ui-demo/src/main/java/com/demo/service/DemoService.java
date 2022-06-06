package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
public class DemoService {

	public List<Employee> getList() {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1, "abc", "emp1");
		empList.add(emp);
		emp = new Employee(1, "bcd", "emp2");
		empList.add(emp);
		emp = new Employee(1, "def", "emp3");
		empList.add(emp);
		emp = new Employee(1, "tre", "emp4");
		empList.add(emp);
		emp = new Employee(1, "ieu", "emp5");
		empList.add(emp);
		return empList;
	}
}
