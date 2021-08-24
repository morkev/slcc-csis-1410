package ioURL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Program reads a Shakespeare play from Project 
 * Gutenberg, and stores the text in a file after
 * displaying it page by page in the console.
 * on the screen.
 * 
 * @author Kevin Mora
 */
public class DemoURLAccess {

	public static void main(String[] args) {
		String urlString = "https://www.gutenberg.org/files/46768/46768-0.txt";
		int pageLength = 35, lineNumber = 0;
		
		try {
			URL url = new URL(urlString);
			try(InputStream stream = url.openStream(); 
					BufferedReader reader =  new BufferedReader(
							new InputStreamReader(stream));
					BufferedWriter writer =  new BufferedWriter(
							new FileWriter("./src/ioURL/shakespeare.txt"));
					Scanner input = new Scanner(System.in)) {
				
				String line = reader.readLine();
				
				while(line != null) {
					System.out.println(line);
					writer.write(line + "\n");
					lineNumber++; 
						if(lineNumber % pageLength == 0) {
							System.out.println("\n - Press 'ENTER' to Continue - \n");
							input.nextLine();
						}
					line = reader.readLine();
				}
			}
		} catch (MalformedURLException e) {
			System.out.println("Problem with URL: " + urlString);
			System.out.println("String could not be parsed.");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("Oppening stream from URL: " 
					+ urlString + " ... caused a problem");
			e.printStackTrace();
		}
	}
}