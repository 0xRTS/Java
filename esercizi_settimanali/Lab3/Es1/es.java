public class es{
	public static void main(String[] args){
		BankAccount account1 = new BankAccount(1000);
		BankAccount account2 = new BankAccount(100);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
				
		account1.withdraw(400);
		account2.deposit(400);
	
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
}
	}