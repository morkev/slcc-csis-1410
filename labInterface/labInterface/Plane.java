package labInterface;

/**
 * @author Kevin Mora
 */
public class Plane {
	private final int numberOfEngines;
	private final String model;
	
	/**
	 * Constructs the integer parameter engines,
	 * and String m – related to the model.
	 * @param engines of type integer
	 * @param m of type String
	 */
	public Plane(int engines, String m) throws IllegalArgumentException {
		if (engines <= 0) {
			throw new IllegalArgumentException
			("ERROR: engine needs to be a positive value bigger than 0.");
		}
		numberOfEngines = engines;
		model = m;
	}
	
	/**
	 * Display specified Strings.
	 * @return methods as Strings
	 */
	public String launch() {
		return "Rolling until take-off";
	}
	public String land() {
		return "Rolling to a stop";
	}

	@Override
	/**
	 * Displays the information as a String
	 * with the following format:
	 * {model} {numberOfEngines}
	 * {launch()}
	 * {land()}
	 */
	public String toString() {
		return String.format("%s with %d engines %n%s%n%s%n", model, 
				numberOfEngines, launch(), land());
	}
}
