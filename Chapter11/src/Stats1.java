import java.io.*;

public class Stats1 {
private static final String String = null;

public static void main(String[]args) {
	File dataFile = new File("scores.dat");
	FileReader in ; 
	BufferedReader readFile;
	double score = 0 ;
	String score2 = null ;
	double score1 ;
	double totalScores = 0 ;
	int numScores = 0;
	
	try {
		in = new FileReader (dataFile);
		readFile = new BufferedReader(in);
		//while (score = readFile.readLine() != null) 
		{ 
		numScores += 1;
		System.out.println(score);
		totalScores +=  Double.parseDouble(score2);
	}
		score = totalScores / numScores ;
		System.out.println ( " Average = " + score2); 
		readFile.close();
		in.close();
	} catch  ( FileNotFoundException e) {
	System.out.println("File does not exist or couldnt be created  .");
	 System.err.println("FileNotFoundException: " + e.getMessage());
	

}      catch ( IOException e ) {

	System.out.println("File does not exist .");
		 System.err.println("IOExpcetion;" + e.getMessage());
	
		
		
	}
  }

public static String getString() {
	return String;
}
}


