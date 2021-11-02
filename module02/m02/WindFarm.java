package m02;

/**
 * Extension of the parameters
 * implemented in class PowerPlant.
 * @author Kevin Mora
 */
public class WindFarm extends PowerPlant{
	
	protected static boolean offshore;
	
	/**
	 * Gets elements from superclass, 
	 * and adds the boolean offshore.
	 * @param capacity of type integer
	 * @param offshore of type boolean
	 */
	public WindFarm(int capacity, boolean offshore) {
		super(capacity);
		WindFarm.offshore = offshore;
	}
	
	/**
	 * Displays a specified String.
	 * @return of type String
	 */
	public String generateElectricity() {
		return "generating electricity from wind";
	}
	
	/**
	 * Displays the information as a String
	 * with the following format if offshore is true:
	 * {class name} {capacity} {~ ~ ~}
	 * {String from generateElectricity()}
	 * 
	 * If offshore is false:
	 * {class name} {capacity}
	 * {String from generateElectricity()}
	 */
	public String toString() {
		if(className().contains("WindFarm") && offshore == true) {
			return className() + " " + capacity + "MW " 
                   + "~ ~ ~" + "\n" + generateElectricity();
		}
		else return className() + " " + capacity + "MW " 
			+ "\n" + generateElectricity();
	}
	

}
