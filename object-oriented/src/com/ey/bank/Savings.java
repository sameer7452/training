package com.ey.bank;

public class Savings extends Accounts {
	
	//Transaction txns=new Transaction();

	public Savings() {
		super();
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BAL);
		txns.add(new Transaction("OB",MIN_SAVINGS_BAL,balance));
	}

	@Override
	public void withdraw(double amount) throws BalanceExeption {
		
		if(amount<=(balance-MIN_SAVINGS_BAL)) {
			balance-=amount;
		    txns.add(new Transaction("OB",amount,balance));}
		else
			throw new BalanceExeption("insufficient balance");
	}
	
	
	

}
