package labInterface;

/**
 * @author Kevin Mora
 */
public class Hangglider extends Bird{

	private static boolean isRigidWing;
	
	/**
	 * Extends the parameters from
	 * superclass Bird, and adds a
	 * new one: isRigidWing.
	 * @param t extends from Bird
	 * @param isRigidWing of type boolean
	 */
	public Hangglider(String t, boolean isRigidWing) {
		super(t);
		Hangglider.isRigidWing = isRigidWing;
	}
	
	/**
	 * @return of type boolean
	 */
	public static boolean isRigidWing() {
		return isRigidWing;
	}	
	
	/**
	 * Display specified Strings.
	 * @return methods as Strings
	 */
	public String launch() {
		return "Running until take-off";
	}
	public String land() {
		return "Gliding to a land";
	}

	/**
	 * Displays the information as a String
	 * with the following format:
	 * {type}
	 * {launch()}
	 * {land()}
	 */
	public String toString() {
		return type + "\n" + launch() + "\n" + land() + "\n";
	}
	
}