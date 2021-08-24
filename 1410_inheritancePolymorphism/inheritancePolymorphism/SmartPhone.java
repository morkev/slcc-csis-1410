package inheritancePolymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Extension of class Phone,
 * with the addition of the integer 
 * <code>storage</code>.
 * @author Kevin Mora
 *
 */
public class SmartPhone extends Phone {
	
	private static int storage;
	
	/**
	 * Extends class with <code>super</>,
	 * Only positive values are allowed for 
	 * the field storage. If there is an 
	 * attempt to create a new smartphone 
	 * with an invalid storage value, 
	 * an IllegalArgumentException is thrown.
	 * 
	 * @param height of type double
	 * @param width of type double
	 * @param depth of type double
	 * @param model of type String
	 * @param storage of type integer
	 */
	public SmartPhone(double height, double width, double depth, String model, int storage) {
		super(height,width,depth, model);
		
		if (storage <= 0) {
			throw new IllegalArgumentException("Storage needs to be positive.");
		} SmartPhone.storage = storage;
	}
	
	public static void browse() {
		System.out.println("Browsing the web");
	}
	
	/**
	 * Returns one of the following two strings:
	 * Taking a horizontal picture,
	 * or Taking a vertical picture.
	 * 
	 * Each time the method is called, 
	 * one of those two strings should 
	 * be chosen randomly.
	 */
	public static void takePicture() {
		List<String> picture = Arrays.asList(
				"Taking a horizontal picture",
				"Taking a vertical picture");
	    Random rand = new Random();
	    String randomElement = picture.get(rand.nextInt(picture.size()));
	    System.out.println(randomElement);
	}
	
	/**
	 * Method overriding the toString()
	 * Displays the information in format: 
	 * {model} ({height} x {width} x {depth}) {storage}
	 */
	public String toString() { 
		return model + " (" + height + " x " + width + " x "
			   + depth + ") " + storage + "GB ";  
	}

}
