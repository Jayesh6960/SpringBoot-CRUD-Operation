package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao ed;

	@Override
	public List<Employee> findAll() {
		
		return ed.findAll();
	}

	@Override
	public Employee findEmployeeByEid(int eid) {
		
		return ed.findEmployeeByEid(eid);
	}

	@Override
	public Employee findEmployeeByEname(String ename) {
		
		return ed.findEmployeeByEname(ename);
	}

	@Override
	public List<Employee> findByEname(String ename) {
		
		return ed.findByEname(ename);
	}

	@Override
	public List<Employee> findByEnameContains(String ename) {
		return ed.findByEnameContains(ename);
	}

	@Override
	public List<Employee> findByEsalaryBetween(double low, double high) {
		
		return ed.findByEsalaryBetween(low, high);
	}

	@Override
	public int deleteByEid(int eid) {
		
		return ed.deleteByEid(eid);
	}

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}
	
	

	

	
	
	
}
