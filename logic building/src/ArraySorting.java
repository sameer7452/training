import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int ar[]= {5,1,3,2,4};
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		System.out.println("--sorted array--");
		//Arrays.sort(ar);
		
		for (int i : ar) {
			System.out.println(i);
		}
		
		long start=System.currentTimeMillis();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - i - 1; j++)
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }			 		
		}
		long end=System.currentTimeMillis();
		
		System.out.println("time taken:"+(end-start)+"ms");
		
		System.out.println("--sorted array--");
		//Arrays.sort(ar);
		
		for (int i : ar) {
			System.out.println(i);
		}
			
		long startselect=System.currentTimeMillis();
		for (int i = 0; i < ar.length - 1; i++)  
		        {  
		            int index = i;  
		            for (int j = i + 1; j < ar.length; j++){  
		                if (ar[j] < ar[index]){  
		                    index = j;  
		                }  
		            }  
		            int smallerNumber = ar[index];   
		            ar[index] = ar[i];  
		            ar[i] = smallerNumber;  
		        }  	
		
	    long endselect=System.currentTimeMillis();
		
        System.out.println("time taken:"+(endselect-startselect)+"ms");
		
		System.out.println("--sorted array--");
		
		for (int i : ar) {
			System.out.println(i);
		}
	}
	}

