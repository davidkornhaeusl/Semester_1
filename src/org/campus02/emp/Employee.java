package org.campus02.emp;

public class Employee {

	private int empNumber;
	private String name, department;
	private double salary;
	
	public Employee(int empNumber, String name, String department, double salary)
	{
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getEmpNumber()
	{
		return this.empNumber;
	}

	public String getName()
	{
		return this.name;
	}

	public String getDepartment()
	{
		return this.department;
	}

	public double getSalary()
	{
		return this.salary;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String toString()
	{
		return "Employee [empNumber=" + empNumber
				+ "], Name [name =" + name
				+ "], Salary [salary = " + salary
				+ "], Department [department =" + department;
	}
}
