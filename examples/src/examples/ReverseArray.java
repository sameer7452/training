package examples;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int A[]= {4,2,7,3,6,9,1,8};
		int b[]= {};
		int j=0;
		System.out.println(Arrays.toString(A));
		
		for(int i=A.length-1;i>=0;i--) {
			b[j]=A[i];
			j++;
			
		}
	}
}
