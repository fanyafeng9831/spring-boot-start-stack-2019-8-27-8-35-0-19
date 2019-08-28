package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@GetMapping(path="/")
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> emp =new ArrayList<Employee>();
		emp.add(new Employee("001","ËïÎò¿Õ",600));
		emp.add(new Employee("001","Öí°Ë½ä",500));
		return ResponseEntity.ok(emp);
	}

}
