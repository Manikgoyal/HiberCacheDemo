package com.techdazzler.spring.service;

import java.util.List;

import com.techdazzler.hibernate.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);
	 
    List<Employee> findAllEmployees();
    
    public List<Employee> findCachedEmployees();
 
    void deleteEmployeeBySsn(String ssn);
 
    Employee findBySsn(String ssn);
 
    void updateEmployee(Employee employee);
	
}
