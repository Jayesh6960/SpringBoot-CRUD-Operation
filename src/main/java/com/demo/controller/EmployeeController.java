package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping(value="/home")
	public String m1() {
		return "Hello";
	}
	
	@GetMapping(value="/all")
	public List<Employee> m2() {
		return es.findAll();
	}
	
	@GetMapping(value="/findbyid/{a}")
	public Employee m2(@PathVariable int a) {
		return es.findEmployeeByEid(a);
	}
	
	@GetMapping(value="/findbyname/{b}")
	public Employee m3(@PathVariable String b) {
		return es.findEmployeeByEname(b);
	}
	
	
	@GetMapping(value="/findbynameall/{c}")
	public List<Employee> m4(@PathVariable String c){
		return es.findByEname(c);
	}
	
	@GetMapping(value="/findbynamecontain/{d}")
	public List<Employee> m5(@PathVariable String d){
		return es.findByEnameContains(d);
	}
	
	@GetMapping(value="/findbysalary/{low}/{high}")
	public List<Employee> m6(@PathVariable double low,@PathVariable double high){
		return es.findByEsalaryBetween(low, high);
	}
	
	@DeleteMapping(value="/delete/{e}")
	public int m7(@PathVariable int e) {
		return es.deleteByEid(e);
	}
	
	@PostMapping(value="/insert")
	public Employee m11(@RequestBody Employee e) {
		return es.save(e);
	}
	
	@PutMapping(value="/update")
	public Employee m12(@RequestBody Employee e) {
		return es.save(e);
	}

}
