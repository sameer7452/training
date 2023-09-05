package com.ey.stock;

public class stock implements Exhange  {
	
	public void getQuote() {
		System.out.println("get quote");
	}
	
	public void setQuote() {
		System.out.println("set quote");
	}
	
	public void viewQuote() {
		System.out.println("view quote");
	}
	
	stock ril= new stock();
	holder h=ril;

}
