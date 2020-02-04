package com.emp.management.dao;
import com.emp.management.entity.Employee;

public interface EmployeeDao {
	public void createEmp(Employee emp);
	public Employee getEmployee(int id);
	public Employee getAllEmployee();
	public boolean deleteEmp(int id);
	public void updateEmp(Employee emp, int id);
}
