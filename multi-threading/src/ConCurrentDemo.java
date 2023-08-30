class BankAccount{
	private double balance=4500.0;
	
	private Object dummy=new Object();
	public void withdraw(double amount) {
		try {
			synchronized (dummy) {
			Thread.sleep(100);
			if(amount<balance) {
				Thread.sleep(100);
				balance=balance-amount;
				System.out.println("balance left:"+balance);
				}else
					System.out.println("insufficient balance");}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Transaction implements Runnable{
	BankAccount bankAccount;
	double amount;
	
	Transaction(BankAccount bankAccount,double amount){
		this.bankAccount=bankAccount;
		this.amount=amount;
	}

	@Override
	public void run() {
       bankAccount.withdraw(amount);	
	}
}


public class ConCurrentDemo {

	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		Transaction tr1=new Transaction(bankAccount,3500.0);
		Transaction tr2=new Transaction(bankAccount,3500.0);
		
		new Thread(tr1).start();
		new Thread(tr2).start();
		
	}
}
