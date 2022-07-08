package com.microservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.model.Department;
import com.microservices.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	public Optional<Department> findDepartmentById(long departmentId) {
		
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
