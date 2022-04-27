import java.io.IOException;

public class MyfileP2 {
	
		public boolean exists;

		public MyfileP2(String string) {
				// TODO Auto-generated constructor stub
			}

		public static class testfiles 
		{
		public static void main(String[] args ) throws IOException {
		Myfile textFile = new Myfile ("c://temp//supplies.txt");
		if (textFile.exists) { 
			System.out.println (" File already exists.");
			 } else {
				 try {
					 textFile.createNewFile();
					 System.out.println("New file created.");
				 } catch (IOException e) {
					 System.out.println("File could not be created.");
					 System.err.println("IOExpcetion;" + e.getMessage());
				 }
				 

		  }
	  }
	} 
}
		
