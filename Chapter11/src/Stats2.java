import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.tools.javac.comp.Enter;

public class Stats2 {
public static final String input = null;
public static BufferedWriter writeFile;

public static class CreateDataFile {

private static final char[] Score = null;
private static char[] name;

public static <Enter> void main(String[]args) {
	File dataFile = new File("Stuscores.dat");
	FileWriter out ; 
	BufferedReader readFile;
	double score = 0 ;
	String score2 = null ;
	
	
	try {
		out = new FileWriter (dataFile);
		writeFile =new BufferedWriter ( out);
		for ( int i = 0; i < 5; i++);
		System.out.println ( Enter student name);
		name = input.next();
		System.out.println(" Enterscore:");
		score = input.nextDouble();
		writeFile.write(name);
		writeFile.newLine();
		writeFile.write(String.valueOf(Score));
		writeFile.newLine();
		}
	writeFile.close();
	out.close();
	System.out.println("Data written to file");
} catch (IOException e) {
	System.out.println("Problem writing to file");
	System.err.println("IOException: + e.getmessage");
		
	}
}
}
  }



