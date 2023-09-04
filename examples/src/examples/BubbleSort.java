package examples;

public class BubbleSort {

	public static void main(String[] args) {
		
        int arr[]= {5,1,3,2,4};
        int n=arr.length;
		
		for (int i : arr) {
			System.out.println(i);
		}	
		int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                      
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
  
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
	}
        System.out.println();
        for (int k: arr) {
			System.out.println(k);
		}	
	}
}
