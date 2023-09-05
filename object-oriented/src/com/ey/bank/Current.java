package com.ey.bank;

public class Current extends Accounts {

	private double overdraft;

	public Current() {
		super();
	}

	public Current(String holder) {
		super(holder, OPENING_CURRENT_BAL);
		this.overdraft = OVERDRAFT_LIMIT;
		ctxns.add(new CurrentTransaction("OB",OPENING_CURRENT_BAL,balance,overdraft));
	}

	@Override
	public void deposit(double amount) {
//		if (overdraft < 10000)
//			if (10000 - overdraft > amount)
//				overdraft += amount;
//			else {
//				
//				amount = amount - (10000 - overdraft);
//				overdraft = 10000;
//				balance += amount;
//			}
//		else
//			balance += amount;
		overdraft += amount;
		if (overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
		}
		ctxns.add(new CurrentTransaction("CR",amount,balance,overdraft));
	}

	@Override
	public void withdraw(double amount) throws BalanceExeption {
//		if (amount > balance) {
//			amount -= balance;
//			balance = 0;
//			overdraft -= amount;
//		} else
//			balance -= amount;
		if(amount<=balance+overdraft) {
			balance-=amount;
			if(balance<MIN_CURRENT_BAL) {
				overdraft+=balance;
				balance=MIN_CURRENT_BAL;
			}
		}else
			throw new BalanceExeption("insufficient balance");
		ctxns.add(new CurrentTransaction("CR",amount,balance,overdraft));
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("overdraft:" + overdraft);
	}

}
