
public class Customer {

	public Customer(String fName, String lName, String str, String city, String st, String zip) {
		// TODO Auto-generated constructor stub
	}
private String firstName, lastName, street, city, state, zip;
		
	

	public Customer1(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}
	

	
	 public String toString() {
		String custString;
	
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";
	 	return(custString);
	}

}
