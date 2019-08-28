package com.tw.apistackbase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	List<Employee> employees =new ArrayList<Employee>();
	@GetMapping(path="/")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> getEmployee(){
		return employees;
	}
	
	@PostMapping(path="/")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee creatEmployee(@RequestBody Employee employee){
		employees.add(employee);
		return employee;
	}
	@GetMapping(path = "/{id}")
	 public ResponseEntity<Employee> getOneEmployee(@PathVariable String id){
	  for(Employee employee:employees) {
	   if(employee.getId().equals(id)) {
	    return ResponseEntity.ok(employee);
	   }
	  }
	  return ResponseEntity.notFound().build();
	 }
	@PutMapping(path = "/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		employees.add(employee);
		return ResponseEntity.ok(employee);
	}
	@DeleteMapping(path = "/{id}")
	public void updateEmployee(@PathVariable String id){
		for(Employee employee:employees) {
			   if(employee.getId().equals(id)) {
		employees.remove(employee);
			   }
		}
		
	}

}
