package interface_1410;

public class Telemarketer extends Person{
	
	/**
	 * Extension of class Person.
	 * Remains with the same values
	 * in a different declaration.
	 * @param name of type String
	 * @param age of type integer.
	 */
	public Telemarketer(String name, int age) {
		super(name, age);
	}
	
	/**
	 * Displays a String with 
	 * the name + specified
	 * characters.
	 * @return String
	 * 
	 * FORMAT:
	 * {name} + "message"
	 */
	public static String giveSalesPitch() {
		return name + " pressures others to buy stuff";
	}
	public String annoy() {
		return name + " annoys by giving a sales pitch";
	}
	
	/**
	 * Return the defined parameters as
	 * a String, with the following format:
	 * {name}({age})
	 */
	public String toString(){
		return name + "(" + age + ")";  
	}
	
}