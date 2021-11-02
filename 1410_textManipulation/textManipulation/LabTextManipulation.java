package textManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User enters their favorite national parks.
 * 
 * Program creates a string that includes all 
 * their favorite parks in a specified format 
 * with ArrayLists:
 * 
 * {park1} | {park2} | . . . | {parkN}
 * 
 * NOTE: We eliminate the last value of the 
 * ArrayList, since it would be the exit 
 * condition ("done").
 * 
 * @author Kevin Mora
 *
 */
public class LabTextManipulation {

	public static void main(String []args){
		
	     Scanner sc = new Scanner(System.in);
	     ArrayList l = new ArrayList();
	     String j = " ";
	     
		     for(int i = 0; i < 100; i++){
		    	 
		    	 while(!j.equalsIgnoreCase("done")){
		    		 System.out.print("Please enter your favorite National Park or DONE to stop: ");
			    	 j = sc.nextLine();
			    	 
				    	 if(i == 0) {
				    		 l.add(capitalizeWord(j));
				    		 break;
				    	 }
			    	 
			         l.add("| " + capitalizeWord(j) );
		    	 }
		    	 
		     }
	     
	     l.remove(l.size() - 1);
	     System.out.print("\n" + "Favorite National Parks: " + listToString(l));
	}
	
	/**
	 * @param l of type String
	 * @return l as an ArrayList without
	 * commas, nor braces – i.e. prints
	 * the values of the ArrayList 
	 * with the specified format.
	 */
	private static String listToString(List<String> l) {
		StringBuilder sb = new StringBuilder(32);
		//String myString = " ";
		
			for(String el : l) {
				//myString += el + " ";
				sb.append(el).append(" ");
			}
			
		return sb.toString();
		//return sb.toString().toUpperCase();
	}

	/**
	 * 
	 * @param str of type String
	 * @return the user's input from
	 * the ArrayList will be sorted 
	 * in such way that the first letter
	 * of each string will be capitalized,
	 * while the rest remains lower-case.
	 */
	public static String capitalizeWord(String str){  
	    String words[] = str.split("\\s");
	    String capitalizeWord = "";
	    
		    for(String w : words){  
		        String first = w.substring(0,1);  
		        String afterfirst = w.substring(1);  
		        capitalizeWord += first.toUpperCase() + afterfirst.toLowerCase() + " ";  
		    }  
		    
		return capitalizeWord.trim();  
	}
	
}