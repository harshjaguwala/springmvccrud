package demoproject.service;

import java.util.List;



import demoproject.model.Employee;


public interface EmployeeService 
{
	public List<Employee> getAllEmployees();
	
	public void addEmployee(Employee employee);

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);

	public Employee updateEmployee(Employee employee);
}
