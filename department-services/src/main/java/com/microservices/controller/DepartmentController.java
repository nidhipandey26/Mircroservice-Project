package com.microservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Department;
import com.microservices.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService; 
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		//log.info("Inside saveDepartment");

		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findDeaprtmentById(@PathVariable("id") long DepartmentId) {
		
		return departmentService.findDepartmentById(DepartmentId);
	}
	

}
