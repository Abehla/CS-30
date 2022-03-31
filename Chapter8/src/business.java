public class business extends Account

	{

		private final int W = 10;
		
		

		public business (double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal,  fName, lName, str,  city,  st,  zip);
		}
		


		
		public void withdraw(double x)
		{
			if(super.getBalance() >= x)
			{
				if(x >500)
				{
					super.deposit(super.getBalance()-x);
				}
				else
				{
					super.deposit(super.getBalance()-x -W);
				}
		}
		}
	}