package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {

	private int accNo;
	private String holder;
	protected double balance;
	protected List<Transaction> txns;
	protected List<CurrentTransaction> ctxns;
	
	//application constants

	private static int counter=500;
	
	public Accounts() {
	}

	public Accounts(String holder, double balance) {
		this.accNo = counter++;
		this.holder = holder;
		this.balance = balance;
		txns=new ArrayList<>();
	}
	
	public void summary() {
		System.out.println("acc no:"+accNo);
		System.out.println("holder:"+holder);
		System.out.println("Balance"+balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("CR",amount,balance));
	}
	
	public void statement() {
		txns.forEach(System.out::println);
	}
	

	
}
