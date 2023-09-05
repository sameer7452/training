package com.ey.shop;

public class ShoppingCart {

	private Product[] products;
	private double total;
	private int index;
	
public ShoppingCart() {
 products=new Product[5];
}

public void addToCart(Product p) throws CartException {
	if(index==products.length)
		throw new CartException("your cart is full");
	else {
	products[index]=p;
	index++;
	total+=p.getPrice();
	}
}

public void checkout() {
	System.out.println("your order summary..");
	for (int i = 0; i < index; i++) 
		products[i].print();
	
	System.out.println("Total amount: "+total);
		
	}
}

