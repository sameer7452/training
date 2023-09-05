package com.ey.bank;

public final class AccountsFactory {
	
	private AccountsFactory() { // so that no one can instantiate it
	}
	
	public static Savings createSavingsAccount(String holder) {
		return new Savings(holder);
	}
	
	public static Current createCurrentAccount(String holder) {
		return new Current(holder);
	}
	

}
