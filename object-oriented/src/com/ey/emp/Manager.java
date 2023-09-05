package com.ey.emp;
public class Manager extends Employee {
	
	private double incentives;

	public Manager() {
		//optional: by defauly a child class calls the default constructor of parent
		super();
	}

	public Manager(String empName, double salary,double incentives) {
		//constructor chaining: calling constructor of aparent class with matching signature
		super(empName, salary);
		this.incentives=incentives;
	}

	@Override
	public void payslip() {
		super.payslip();  // calling payslip method of super class
		System.out.println("incentives:"+incentives);
	}

	@Override
	public double getSalary() {
		
		return super.getSalary()+incentives;
		
	}
	
	
	
	

}
