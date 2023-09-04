package Inventry;

import java.util.Scanner;

public class ProductMenu {

	private static ProductJdbcDao dao;
	static {
		dao=new ProductJdbcDao();
	}
	
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		
		while(true) {
			System.out.println("main menu");
			System.out.println("1.Add Products\n2.Find Products\n3.List Products\n4.Delete Product\n5.Exit");
			System.out.println("Enter choice: ");
			int choice=console.nextInt();
            switch(choice){
            case 1:addProduct();break;
            case 2:findProduct();break;
            case 3:listProduct();break;
            case 4:delProduct();break;
            case 5:System.exit(0);
            default:System.out.println("invalid option");
				
			}
		}
	}
	
	private static void addProduct(){
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter the product code");
		int code=console.nextInt();
		System.out.println("enter the product name:");
		String name =console.next();
		System.out.println("enter the product price");
		double price=console.nextDouble();
		
		Product p =new Product(code,name,price);
		dao.add(p);
		
	}
	
	private static void findProduct() {
		Scanner console=new Scanner(System.in);
		
		System.out.println("enter the product code:");
		int code=console.nextInt();
		
		System.out.println(dao.find(code));
	}
	
	private static void listProduct() {
		dao.list().forEach(System.out::println);
	}
	
	private static void delProduct(){
		Scanner console=new Scanner(System.in);
		
		System.out.println("enter product code: ");
		int code=console.nextInt();
		
		dao.delete(code);
	}
}
