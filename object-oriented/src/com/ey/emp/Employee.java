package com.ey.emp;


public abstract class Employee {

	private int empNo;
	private String empName;
	private double salary;

	private static int counter;
	
	static {   //static initializer block - executes at the time of class loading
		counter=901;
		System.out.println("account class load");
	}
	
	{
		System.out.println("EMPLOYEE OBJECT CREATED..");
	}
	public Employee() {
	}

	public Employee(String empName, double salary) {
		System.out.println("constructor");
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("emp no:" + empNo);
		System.out.println("emp name:" + empName);
		System.out.println("salary:" + salary);
	}

	public double getSalary() {
		return salary;
	}

}
