package demoproject.dao;

import java.util.List;

import demoproject.model.Employee;


public interface EmployeeDAO
{
	public List<Employee> getAllEmployees();
    
	public void addEmployee(Employee employee);
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}
