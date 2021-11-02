package m02;

/**
 * Displays information related
 * to the conditions provided by
 * the user for the PowerPlant object.
 * @author Kevin Mora
 */
public class PowerPlant {
	
	protected static int capacity;
	
	/**
	 * Throws an IllegalArgumentException
	 * if the capacity value is equal or
	 * less than 0. Creates the capacity.
	 * @param capacity of type integer
	 * @throws IllegalArgumentException
	 */
	public PowerPlant(int capacity) throws IllegalArgumentException {
		if (capacity <= 0) {
			throw new IllegalArgumentException
			("ERROR: capacity needs to be a positive value.");
		}
		PowerPlant.capacity = capacity;
	}
	
	/**
	 * Displays a specified String.
	 * @return of type String
	 */
	public String generateElectricity() {
		return "generating electricity";
	}
	
	/**
	 * Gets the name of the class,
	 * and displays it as a String.
	 * @return class name.
	 */
	public String className() {
		String className = this.getClass().getSimpleName();
		return className;
	}
	
	/**
	 * Displays the information as a String
	 * with the following format:
	 * {class name} {capacity}
	 * {String from generateElectricity()}
	 */
	public String toString() {
		if(className().contains("PowerPlant")) {
			return className() + " " + capacity + "MW" 
                   + "\n" + generateElectricity();
		}
		// this line can create an extra condition 
		else return className() + " " + capacity + "MW";
	}

}