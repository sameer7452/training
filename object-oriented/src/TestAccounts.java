import com.ey.bank.Current;
import com.ey.bank.Savings;
import com.ey.bank.AccountsFactory;
import com.ey.bank.BalanceExeption;
import com.ey.bank.Bank;
public class TestAccounts {

	public static void main(String[] args) {
		
		
		
		Bank s1= AccountsFactory.createSavingsAccount("sam");
		try {
			s1.withdraw(10);
		} catch (BalanceExeption e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); //for developers to troubleshoot the errors/issues
            //System.out.println(e); //logging:to audit system behaviour
            System.out.println(e.getMessage());//end users
		}
		
		
		//Bank c1 = AccountsFactory.createCurrentAccount("paul");
		//c1.summary();
		s1.statement();
	}
}