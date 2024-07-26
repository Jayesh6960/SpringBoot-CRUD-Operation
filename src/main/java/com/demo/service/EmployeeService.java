package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findEmployeeByEid(int eid);
	public Employee findEmployeeByEname(String ename);
	public List<Employee> findByEname(String ename);
	public List<Employee> findByEnameContains(String ename);
	public List<Employee> findByEsalaryBetween(double low,double high);
	public int deleteByEid(int eid);
	public Employee save(Employee e);
}
