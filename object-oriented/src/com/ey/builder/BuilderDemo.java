package com.ey.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		Computer pc1=new Computer.PCBuilder("intel i3", 16, 512).build();
		System.out.println(pc1);
		
		Computer pc2=new Computer.PCBuilder("intel i3", 16, 512).build();
		
		System.out.println(pc2);
		
		
	}
}
