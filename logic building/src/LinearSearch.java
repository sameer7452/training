
public class LinearSearch {

	public static void main(String[] args) {
		
		int a1[]= {12,30,45,15,21,60};
		int key=15;
		int j;
		for (int i = 0; i < a1.length; i++) {
			if(a1[i]==key)
			{
				j=i;
			System.out.println("the number is found at\t"+j+" index");}
		}
		
	}
}
