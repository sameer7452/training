package com.ey.emp;

public class Clerk extends Employee {

	private double comission;

	public Clerk() {
		super();
	}

	public Clerk(String empName, double salary,double comission) {
		super(empName, salary);
		this.comission=comission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("comisssion:"+comission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+comission;
	
	
	}
	
}
