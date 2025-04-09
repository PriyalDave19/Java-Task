class Account{
	

	String accountNumber ;
	float balance;

	Account(String accNum , float bal){
		if(!accNum.isEmpty() && accNum != null && bal > 0)
		{
			accountNumber = accNum;
			balance = bal;
			System.out.println("\nAccount Number = "+accountNumber+"\nBalance = "+balance);
		}
		else
			System.out.println("\nValidation Fails");
			
	}

	public static void main(String [] args){
		Account a1 = new Account("596556455ffdhh",45000.002f);
		
	}
}