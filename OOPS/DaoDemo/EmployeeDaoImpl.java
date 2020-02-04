//package name
package com.emp.management.dao;

//imported packages
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.emp.management.connection.ConnectionFactory;
import com.emp.management.entity.Employee;

//public class
public class EmployeeDaoImpl implements EmployeeDao {
	
	//Connection Factory Reference variable
	ConnectionFactory connectionFactory;
	
	//creates user
	public void createEmp(Employee emp) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.connectionFactory = new ConnectionFactory();
		Connection connection = employeeDaoImpl.connectionFactory.getConnection();
		try {
	        PreparedStatement ps = connection.prepareStatement("INSERT INTO emp VALUES (?, ?, ?, ?, ?, ?, ? )");
	        ps.setInt(1, emp.getId());
	        ps.setString(2, emp.getName());
	        ps.setInt(3, emp.getAge());
	        ps.setString(4, emp.getCity());
	        ps.setString(5, emp.getDesignation());
	        ps.setString(6, emp.getEmail());
	        ps.setString(7, emp.getContact());
	        int i = ps.executeUpdate();
	      if(i == 1) {
	    	  System.out.println("Data Inserted in Database..");
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }finally {
			employeeDaoImpl.connectionFactory.closeConnection(connection);
		}
	}
	
	
	
	
	
	//Retrieve user by ID:
	public Employee getEmployee(int id) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.connectionFactory = new ConnectionFactory();
		Connection connection = employeeDaoImpl.connectionFactory.getConnection();
	    try {
	    	Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("Select * from emp where id = "+ id);
	        if(rs.next())
	        {
	        	id = rs.getInt("id");
	        	String name = rs.getString("name");
	        	int age = rs.getInt("age");
	        	String city = rs.getString("city");
	        	String designation = rs.getString("designation");
	            String email = rs.getString("email");
	            String contact = rs.getString("contact");
	            System.out.println("Results from database");
	            System.out.println("ID of Employee is\t"+id +"\nName of Employee is\t"+name +"\nAge of Employee is \t"+age 
	            		+"\nCity of Employee is \t"+ city 
	            		+"\nDesignation of Employee is \t" + designation + "\nEmail of Employee is \t" + email +
	                    "\nAge of Employee is \t"+ contact);
	        }
	        else {
	        	System.out.println("Data not Present");
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }finally {
			employeeDaoImpl.connectionFactory.closeConnection(connection);
		}
	    return null;
	}
	
	
	
	//get all records from data
	public Employee getAllEmployee() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.connectionFactory = new ConnectionFactory();
		Connection connection = employeeDaoImpl.connectionFactory.getConnection();
		String query = "Select * from emp";
	    try {
	    	Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        System.out.println("All records");
	        while(rs.next())
	        {
	        	int id = rs.getInt("id");
	        	String name = rs.getString("name");
	        	int age = rs.getInt("age");
	        	String city = rs.getString("city");
	        	String designation = rs.getString("designation");
	            String email = rs.getString("email");
	            String contact = rs.getString("contact");
	            
	            System.out.println("ID of Employee is\t"+id +"\nName of Employee is\t"+name +"\nAge of Employee is \t"+age 
	            		+"\nCity of Employee is \t"+ city 
	            		+"\nDesignation of Employee is \t" + designation + "\nEmail of Employee is \t" + email +
	                    "\nAge of Employee is \t"+ contact+"\n\n");
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }finally {
			employeeDaoImpl.connectionFactory.closeConnection(connection);
		}
	    return null;
	}
	
	
	
	//delete records using name
	public boolean deleteEmp(int id) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.connectionFactory = new ConnectionFactory();
		Connection connection = employeeDaoImpl.connectionFactory.getConnection();
		try {
	        Statement stmt = connection.createStatement();
	        id = stmt.executeUpdate("DELETE FROM emp WHERE id = " + id);
	      if(id == 1) {
	    	  System.out.println("Record Deleted Successfully ");
	    	  return true;
	      }
	      else {
	    	  System.out.println("Record Not Found or Already Deleted");
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }finally {
			employeeDaoImpl.connectionFactory.closeConnection(connection);
		}
	    	return false;
	}
	
	
	
	//update employee record
	public void updateEmp(Employee emp, int id) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.connectionFactory = new ConnectionFactory();
		Connection connection = employeeDaoImpl.connectionFactory.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE emp SET name=?, age=?, city=?, designation=?, email=?, contact=? WHERE id=?");
	        ps.setInt(1, emp.getId());
	        ps.setString(2, emp.getName());
	        ps.setInt(3, emp.getAge());
	        ps.setString(4, emp.getCity());
	        ps.setString(5, emp.getDesignation());
	        ps.setString(6, emp.getEmail());
	        ps.setString(7, emp.getContact());
	        int i = ps.executeUpdate();
	        if(i == 1) {
	    	  System.out.println("Record Updated..!");
	      }else {
	    	  System.out.println("Some Error..!");
	      }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }finally {
			employeeDaoImpl.connectionFactory.closeConnection(connection);
		}
	}
}
