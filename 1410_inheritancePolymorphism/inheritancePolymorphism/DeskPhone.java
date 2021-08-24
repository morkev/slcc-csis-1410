package inheritancePolymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * The constructor includes two parameters 
 * to initialize the superclass Phone,
 * and a third parameter to initialize 
 * the field voltage. There is no parameter 
 * to initialize the field connected. 
 *  
 * @author Kevin Mora
 *
 */
public class DeskPhone extends Phone{
	
	private Voltage level;
	
	public DeskPhone(double height, double width, double depth, String model, String level) {
		super(height,width,depth, model);
		this.level = Voltage.values()[new Random().nextInt(Voltage.values().length)];
	}
	
	/**
	 * Prints the following Strings
	 * as a random value within the 
	 * getConnection() method.
	 * @return
	 */
	public static String plugIn() {
		return "connected";
	}
	public static String unplug() {
		return "not connected";
	}
	
	/**
	 * Initializes a List, and outputs
	 * one of the previous conditions
	 * randomly – eventually toString().
	 * @return
	 */
	public static String getConnection() {
		List<String> picture = Arrays.asList(plugIn(),unplug());
	    Random rand = new Random();
	    String randomElement = picture.get(rand.nextInt(picture.size()));
		return randomElement;
	}
	
	/**
	 * Returns a String with following format:
	 * {model} {dimension} {voltage} {connectionInfo}
	 * 
	 * NOTE: {model}, {dimension} and {voltage} 
	 * are substituted by the corresponding 
	 * field values, and {connectionInfo} 
	 * is one of any two strings: 
	 */
	public String toString() { 
		return model + " (" + height + " x " + width + " x " + depth + ") " + level + " " + getConnection();  
	}
	
}
