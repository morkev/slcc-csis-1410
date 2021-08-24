package m05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Prints the file "Quote.txt" in a new 
 * text file named "Quote-2.txt" without
 * changes nor modifications.
 * 
 * @author Kevin Mora
 */
public class Module05Quote2 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/kevinmora/Desktop/Quote.txt");
		Scanner scan = new Scanner(file);
		String fileContent = "";
		
		while (scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("/Users/kevinmora/Desktop/Quote-2.txt");
		writer.write(fileContent);
		writer.close();
	}
}