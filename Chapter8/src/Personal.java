import java.text.NumberFormat;
public class Personal extends Account

	{

		private final int W = 2;
		
		

		public Personal (double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal,  fName, lName, str,  city,  st,  zip);
		}
		


		
		public void withdraw(double x)
		{
			if(super.getBalance() >= x)
			{
				if(x >100)
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



