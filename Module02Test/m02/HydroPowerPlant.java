package m02;

/**
 * Extension of the parameters
 * implemented in class WindFarm.
 * @author Kevin Mora
 */
public class HydroPowerPlant extends WindFarm{
	
	protected static boolean dam;
	
	/**
	 * Gets elements from superclass, 
	 * and adds the boolean dam.
	 * @param capacity of type integer
	 * @param dam of type boolean
	 */
	public HydroPowerPlant(int capacity, boolean dam) {
		super(capacity, dam);
		HydroPowerPlant.dam = dam;
	}
	
	/**
	 * Displays a specified String.
	 * @return of type String
	 */
	public String generateElectricity() {
		return "generating electricity from water";
	}
	
	/**
	 * Displays the information as a String
	 * with the following format if dam is true:
	 * {class name} {capacity} {with a dam}
	 * {String from generateElectricity()}
	 * 
	 * If dam is false:
	 * {class name} {capacity} {without a dam}
	 * {String from generateElectricity()}
	 */
	public String toString() {
		if(className().contains("HydroPowerPlant") && dam == true) {
			return className() + " " + capacity + "MW" 
                   + " with a dam" + "\n" + generateElectricity();
		}
		else return className() + " " + capacity + "MW" 
        + " without a dam" + "\n" + generateElectricity();
	}
	
}
