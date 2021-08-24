package m05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Prints "Quote.txt" in a new text
 * file "Quote-3" with numbers at the beginning 
 * of each sentence, and UpperCase letters in 
 * sentences with odd numbers due to a 
 * modulus operation within an if-condition.
 * 
 * @author Kevin Mora
 */
public class Module05 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/kevinmora/Desktop/Quote.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "";
		int x = 0;
		while (scan.hasNextLine()) {
			x++;
			if(x % 2 == 1) {
				if(x < 10) {
					fileContent = fileContent.concat("0" + x + " " + scan.nextLine().toUpperCase() + "\n");
				} else {
					fileContent = fileContent.concat(x + " " + scan.nextLine().toUpperCase() + "\n");
				}
			}
			else {
				if (x < 10){
					fileContent = fileContent.concat("0" + x + " " + scan.nextLine() + "\n");
				} else {
					fileContent = fileContent.concat(x + " " + scan.nextLine() + "\n");
				}
			}
		}

		FileWriter writer = new FileWriter("/Users/kevinmora/Desktop/Quote-3.txt");
		writer.write(fileContent);
		writer.close();
	}
}