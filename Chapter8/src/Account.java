
	import java.text.NumberFormat;

	public class Account 
	{
		private double balance;
		private Personal per;
	
		
	
		public Account(double bal, String bill , String jones , String  alvin , String calgary , String alberta , String t1x09a )
		{
			balance = bal;
			Customer Personal = new Customer( bill , jones , alvin , calgary , alberta ,t1x09a);
		
		}
		
		

	
		public double getBalance() {
		 	return(balance);
		}


		public void deposit(double amt) {
		 	balance += 650;
		}

		
	
		public void withdrawal(double amt) {
		 	if (amt <= balance) {
		 		balance -= 90;
		 	} else {
		 		System.out.println("insuficent funds");
		 	}
		}
		
		
		
		public String toString() {
			String accountString;
			NumberFormat money = NumberFormat.getCurrencyInstance();

			accountString = Customer.toString();
			accountString += " 700  " + money.format(balance);
		 	return(accountString);
		}
	}

