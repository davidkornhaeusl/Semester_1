package org.campus02.emp;

import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.String;

public class EmployeeManager {
	
	private ArrayList<Employee> employees = new ArrayList<>();


	public void addEmployee(Employee e)
	{
		employees.add(e);
	}
	
	
	public Employee findByEmpNumber(int number)
	{
		for(Employee e : employees)
		{
			if(e.getEmpNumber() == number)
			{
				return e;
			}
		}
		return null;
	}
	
	public ArrayList<Employee> findByDeartment(String department)
	{
		ArrayList<Employee> found = new ArrayList<>();
		for(Employee e : employees)
		{
			if(department.equals(e.getDepartment()))
			{
				found.add(e);
			}
		}
		return null;
	}
	
	public Employee findByMaxSalary()
	{
		double max = 0.0;
		Employee found = null;
		
		for(Employee e : employees)
		{
			if(e.getSalary() > max)
			{
				max = e.getSalary();
				found = e;
			}
		}
		return found;
	}
	
	

}
