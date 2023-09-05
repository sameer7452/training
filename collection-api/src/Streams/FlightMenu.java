package Streams;

import java.util.Scanner;

public class FlightMenu extends FlightStreamDemo{

	private static FlightStreamDemo dao;
	static{
		dao=new FlightStreamDemo();
	}
	
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		while(true) {
			System.out.println("Menu:");
			System.out.println("1:add flights\n2:list\n3:find by source and destination\n4:delete\n5:exit");
			System.out.println("enter your choice:");
			int choice =console.nextInt();
			switch(choice) {
			case 1:addFlight();break;
			case 2:listFlight();break;
			case 3:findFlight();break;
			case 4:deleteFlight();break;
			case 5:System.exit(0);
			default:System.out.println("invalid choice");
			}
		}
	}
	
	public static void addFlight() {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter flights details");
		System.out.println("code,carrier,source,destination");
		int code=console.nextInt();
		String carrier=console.next();
		String source=console.next();
		String destination=console.next();
		Flight f=new Flight(code,carrier,source,destination);
		dao.add(f);
	}
	
	public static void listFlight(){
		dao.list().forEach(System.out::println);;
	}
	
	public  static void findFlight() {
		Scanner console=new Scanner(System.in);
		System.out.println("enter the souce and destination");
		String source=console.next();
		String destination=console.next();
		dao.findBySrcDes(source, destination);
	}
	
	public static void deleteFlight() {
		Scanner console=new Scanner(System.in);
		System.out.println("enter the code of flight to delete");
		int code=console.nextInt();
		dao.delete(code);
	}
}
