package com.ey.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		Turbo t=new SportsCar("Ferrari",220);
		System.out.println(t);
		System.out.println("Top Speed:"+t.getSpeed());
		
		NItro n1= new SpeedAdapter(t);
		System.out.println("top speed in kms:"+n1.getSpeedKms());
		
		Turbo t2=new SportsCar("Porche",240);
		System.out.println(t2);
		System.out.println("Top Speed:"+t2.getSpeed());
		
		NItro n2= new SpeedAdapter(t2);
		System.out.println("top speed in kms:"+n2.getSpeedKms());
		
	}
}
