package examples;

public class InsertionSort {
	public static void main(String[] args) {
		
	
	
	int ar[] = {5,1,3,2,4};
	
	for (int i : ar) {
		System.out.println(i);
	}  	

	
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
	
	    System.out.println();
		for (int i : ar) {
		System.out.println(i);
	}

	}
}
