package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	public List<Employee> findAll();
	
	public Employee findEmployeeByEid(int eid);
	public Employee findEmployeeByEname(String ename);
	public List<Employee> findByEname(String ename);
	public List<Employee> findByEnameContains(String ename);
	public List<Employee> findByEsalaryBetween(double low,double high);
	public int deleteByEid(int eid);
	public Employee save(Employee e);
	
}
