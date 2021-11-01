package docComments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * Creating and initializing 4 fields
 * in order to set up an ArrayList 
 * with such parameters
 * 
 * (year, brand, model & id).
 * 
 * @author Kevin Mora
 *
 */
public class VideoGame {
	private static int year;
	private static String brand;
	private static String model;
	private static String id;
	
	/**
	 * Creating getters and setters for the 4 fields:
	 * year, brand, model & id.
	 * @param year initialized as a constructor
	 * of type integer.
	 */
		VideoGame(int year) {
			this.year = year;
		}
		/**
		 * @return year as video game 
		 * console release date, followed 
		 * by a setter.
		 */
			public static int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
		}
		/**
		 * Setting the constructor with the fields.
		 * 
		 * @param brand of type String
		 * @param model of type String
		 * @param id of type String
		 */
		VideoGame(String brand, String model, String id) {
			this.brand = brand;
			this.model = model;
			this.id = id;
		}
			/**
			 * @return String brand 
			 * – e.g. Nintendo, Sony, Xbox.
			 */
			public static String getBrand() {
				return brand;
			}
			public void setBrand(String brand) {
				this.brand = brand;
			}
			
			/**
			 * @return String model
			 * – e.g. Switch, PS5, SeriesX
			 */
			public static String getModel() {
				return model;
			}
			public void setModel(String model) {
				this.model = model;
			}
			
			/**
			 * @return String id
			 * – combination of 7 random number
			 * generated with getRandomNumberString
			 */
			public static String getID() {
				return id;
			}
			public void setID(String id) {
				this.id = id;
		}
			

	public static void main(String[] args) {
		
        System.out.println("SELECT ONE OF THE OPTIONS:");

        Scanner sc = new Scanner(System.in);
        
        int selection;

        do{
            menuPrompt();
            selection = sc.nextInt();

            switch (selection) {
                case 1:
                	
            		/**
            		 * Initialize 3 ArrayLists as output
            		 * examples for the sake of time.
            		 * 
            		 * – If not required, eliminate 
            		 * lines: 113 to 132
            		 */
                	ArrayList<String> element1 = new ArrayList<String>();
	                	element1.add("2017");
	                	element1.add("Nintendo");
	                	element1.add("Switch");
	                	element1.add(getRandomNumberString());
	                	System.out.println(listToString(element1));
	                	
                	ArrayList<String> element2 = new ArrayList<String>();
	                	element2.add("2020");
	                	element2.add("Sony");
	                	element2.add("PlayStation 5");
	                	element2.add(getRandomNumberString());
	                	System.out.println(listToString(element2));
                	
                	ArrayList<String> element3 = new ArrayList<String>();
	                	element3.add("1996");
	                	element3.add("Nintendo");
	                	element3.add("64");
	                	element3.add(getRandomNumberString());
	                	System.out.println(listToString(element3));
                	
                	System.out.printf("%d %s %s %s\n", getYear(), 
                			getBrand(), getModel(), getID());
                    break;
                    
                case 2:
                	System.out.print("Year: ");
                		int year = sc.nextInt();
                		sc.nextLine();
                	
                	System.out.print("Brand: ");
                	String brand = sc.nextLine();
                	
                	System.out.print("Model: ");
                	String model = sc.nextLine();
                	
                	String id = getRandomNumberString();
                	//System.out.println(id);
                	
                	VideoGame videogame1 = new VideoGame(brand, model, year, id);
                	List<String> parks = Arrays.asList(brand, model, id);
                	
                    //System.out.println(parks);
                    break;
                    
                case 3:
                	String IDstring = String.valueOf(getID());
                	
                	System.out.println("Type the ID: ");
                		sc.nextLine();
                	String newID = sc.nextLine();
                	
                	if(newID == IDstring) {
                		System.out.printf("%d %s %s %s\n", 
                				getYear(), getBrand(), getModel(), getID());
                	} else {
                		System.out.println("Invalid entry – data not found");
                	}
                    break;
                    
                case 4:
                    System.out.println("DELETE");
                    deleteElement();
                    break;
                    
                case 5:
                	System.out.println("Number of Consoles");
                	numberConsoles();
                    break;
                    
                case 6:
                	System.out.println("Goodbye!");
                    break;
                    
                default:
                	System.out.println("Enter a selection 1 - 6");
                    break;
            }

        } while(selection != 6);
        
	}
    
	/**
	 * menuPrompt displays all the options 
	 * related to the switch structure,
	 * such as Show, Add, Delete, etc.
	 */
	public static void menuPrompt() {
        System.out.println("\n1 ... Show all video game Consoles");
        System.out.println("2 ... Add a new Console");
        System.out.println("3 ... Find a Console");
        System.out.println("4 ... Delete a Console");
        System.out.println("5 ... Number of Consoles");
        System.out.println("6 ... EXIT");
    }
    
	/**
	 * Generates a 7 digit random Number.
	 * From 0 to 9999999
	 * @return number as a String
	 */
    public static String getRandomNumberString() {
        Random rnd = new Random();
        int number = rnd.nextInt(9999999);
        return String.format("ID key: %07d", number);
    }
    
    /**
     * @param brand String as brand
     * @param model String as model
     * @param year int as year
     * @param id String as id
     */
    public VideoGame(String brand, String model, int year, String id) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.id = id;
	}
    
    /**
     * Calculates the number of video game
     * consoles registered.
     */
    static void numberConsoles() {
    	ArrayList<String> stringList = new ArrayList<>();
	    	stringList.add(brand);
	    	stringList.add(model);
	    	stringList.add(id);
	    	
    	String yearString = String.valueOf(getYear());
    		stringList.add(yearString);
    		
    	//System.out.println(stringList);
    	System.out.println("Number of Consoles: " + stringList.size());
    }
    
    /**
     * Deletes the selected array
     */
    static void deleteElement() {
    	ArrayList<String> stringList = new ArrayList<>();
    	stringList.clear();
    	System.out.println(getID() + " has been successfully deleted.");
    }
    
    /**
     * 
     * @param list takes the values from the
     * ArrayLists and outputs them with a space, 
     * no commas, nor [] symbols.
     * @return StringBuilder as String.
     */
    private static String listToString(List<String> list) {
		StringBuilder sb = new StringBuilder(32);
		for(String el : list) {
			sb.append(el).append(" ");
		}
		return sb.toString();
	}
    
}
