package demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demoproject.dao.EmployeeDAO;
import demoproject.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDAO employeeDAO;
	
//	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
//		this.employeeDAO = employeeDAO;
//	}
	
//	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
//		super();
//		this.employeeDAO = employeeDAO;
//	}

	
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	
	
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);

	}
	
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDAO.deleteEmployee(employeeId);

	}

	@Transactional
	public Employee getEmployee(int empid) {
		return employeeDAO.getEmployee(empid);
	}
	
	@Transactional
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}
	
	
}
