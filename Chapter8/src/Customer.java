
public class Customer {

	
public Customer(String bill, String jones, String alvin , String calgary, String alberta, String t1x09a) {
		
	}
private String firstName, lastName, street, city, state, zip;
		
	

	public void Customer1(String bill, String jones , String alvin , String calgary, String alberta, String t1x09a) {
		firstName = bill;
		lastName = jones;
		street = alvin ;
		city = calgary ;
		state = alberta;
		zip = t1x09a;
	}
	

	
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}

}
