package com.emp.management.main;

import com.emp.management.dao.EmployeeDao;
import com.emp.management.dao.EmployeeDaoImpl;
import com.emp.management.entity.Employee;

public class ManageEmployee {
	
	
	public static void main(String[] args){
		EmployeeDao employeeDao= new EmployeeDaoImpl();
		Employee employee = new Employee(  1, "Usman", 32, "RWP", "CEO", "usman@gmail","03311312");
		
		//Create Record
		employeeDao.createEmp(employee);
		
		//get employee by ID
		employeeDao.getEmployee(6);
		
		//get all Records
		employeeDao.getAllEmployee();
		
		//delete employee by id
		employeeDao.deleteEmp(62);
		
		//update record
		employeeDao.updateEmp(employee,1);
	}

}
