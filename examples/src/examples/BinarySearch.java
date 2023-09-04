package examples;

import java.util.Iterator;

public class BinarySearch {

	public static void main(String[] args) {
		int a1[]= {12,23,45,67,78,89};
		int key=45;
		int start=0;
		int last=a1.length;
		int mid;
		for (int i = 0; i < a1.length; i++) {
			mid=(last+start)/2;
			if(a1[mid]==key) {
				System.out.println("the number is found in "+mid+" index");
				break;
			}
			
			if(a1[mid]>key) {
				last=mid;	
			}
			if(a1[mid]<key) {
				start=mid;
			}
		}
	}
}
