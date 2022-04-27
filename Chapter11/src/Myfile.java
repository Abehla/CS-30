
public class Myfile 
{
public boolean exists;

public Myfile(String string) {
		// TODO Auto-generated constructor stub
	}

public static class testfiles 
{
public static void main(String[] args ) {
Myfile textFile = new Myfile ("c://temp//supplies.txt");
if (textFile.exists) { 
	System.out.println (" File already exists.");
	 } else {
		 System.out.println("File does not exist.");

}
}
}

public void createNewFile() {
	// TODO Auto-generated method stub
	
}


}




