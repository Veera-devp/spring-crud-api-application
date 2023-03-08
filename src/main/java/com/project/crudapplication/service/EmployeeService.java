package com.project.crudapplication.service;

import java.util.List;

import com.project.crudapplication.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findByid(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
