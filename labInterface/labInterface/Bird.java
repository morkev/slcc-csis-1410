package labInterface;

/**
 * Displays interfaces in the classes 
 * Bird, Hangglider, and Plane. 
 * Demonstrates polymorphism and dynamic 
 * binding with unrelated classes. 
 * @author Kevin Mora
 */
public class Bird {
	
	protected final String type;
	
	/**
	 * Constructs a String
	 * that will display
	 * the type of bird.
	 * @param t
	 */
	public Bird(String t) {
		type = t;
	}
	
	/**
	 * Gets the name of the class,
	 * and displays it as a String.
	 * @return
	 */
	public String className() {
		String className = this.getClass().getSimpleName();
		return className;
	}
	
	/**
	 * Display specified Strings.
	 * @return methods as Strings
	 */
	public String launch() {
		return "Flapping the wings to take off";
	}
	public String land() {
		return "Flapping the wings until landing";
	}
	
	/**
	 * Displays the information as a String
	 * with the following format:
	 * {type}
	 * {launch()}
	 * {land()}
	 */
	public String toString() {
		if(className().contains("Bird")) {
			return type + "\n" + launch() + "\n" + land() + "\n";
		}
		else return className();
	}
}