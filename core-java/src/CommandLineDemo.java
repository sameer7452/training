
public class CommandLineDemo {
public static void main(String[] args) {
    int sum=0;
    
	for(String a:args) {
		//System.out.println(a);
		
		sum = sum+Integer.parseInt(a);	
	}
	
	System.out.println(sum);
	int x=5;
	Integer xo=x; //boxing
	int z = xo; //unboxing
 //System.out.println(x+xo*z);
 //java takes care of boxing and unboxing hence it is called auto-boxing
 
}
}
