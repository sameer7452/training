package com.ey.stock;

public class StockSingleton {

	private static stock stk;
	
	public static stock getStock() {
		if(stk==null)
			stk=new stock();
		
		return stk;
	}
}
