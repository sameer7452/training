package com.ey.bank;

public class CurrentTransaction {
	
	private String type;
	private double amount;
	private double balance;
	private double overdraft;

	public CurrentTransaction() {
		// TODO Auto-generated constructor stub
	}

	public CurrentTransaction(String type, double amount, double balance, double overdraft) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.overdraft = overdraft;
	}

	@Override
	public String toString() {
		return "CurrentTransaction [type=" + type + ", amount=" + amount + ", balance=" + balance + ", overdraft="
				+ overdraft + "]";
	}
	
	
}
