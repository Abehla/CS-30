public class TestAcct {

	public static void main(String[] args) 
	{
		
		
		Personal bank = new Personal(200,"John", "Jones", "Alberta","Calgary", "Seaton", "T1X 02A");
		business bank =  new business(100, "Bill","Gates", "Alberta", "Edmonton","Westmere", "T1X 07Q");
		
		System.out.println(bank.toString() + "\n");
		
		System.out.println(bank.toString());
		
		
		
		}
}

