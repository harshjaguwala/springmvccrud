package demoproject.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import demoproject.model.Employee;

@EnableTransactionManagement
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO
{

	@Autowired
    private SessionFactory sessionFactory;
 
	@SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {
    	return sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }
    
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
   
    public void deleteEmployee(Integer employeeId) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, employeeId);
        if (null != employee) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
 
    }
 
    public Employee getEmployee(int empid) {
        return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, empid);
    }
 
    
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }

}
