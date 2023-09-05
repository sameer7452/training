package com.ey.shop;

/**
 * @author sameer
 * this class represents our shopping application
 */


public class Product {

	private String name;
	private double price;
	
	public Product() {
		
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println("name:"+name+"\tPrice:"+price);
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}
	
}
