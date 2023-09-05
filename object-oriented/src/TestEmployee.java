import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m1 = new Manager("mike",5000,2000);

		
		Clerk c1 = new Clerk("sam",3000,1000);
		
	
		showsalary(m1);
		showsalary(c1);
		
	}

	private static void showsalary(Employee e) { // creation of refrence in abstract class helps us achive polymorphism
		if(e instanceof Manager)
			System.out.println("manager salry:"+e.getSalary());
		else
			System.out.println("Clerk salry:"+e.getSalary());
	}

//	private static void showsalary(Clerk c1) {
//		System.out.println("clerk salary:"+c1.getSalary());
//	}
//
//	private static void showsalary(Manager m1) {
//		System.out.println("manger salary:"+m1.getSalary());		
//	}
	
	
}
