package docComments;

/**
 * Creates 3 fields, each with either:
 * make, model, or miles per gallon of a vehicle
 * 
 * @author Kevin Mora
 *
 */
public class Car {
	private String make;
	private String model;
	private int mpg;
	
	/**
	 * @param make		brand (e.g. BMW, Honda...)
	 * @param model		model of a vehicle	
	 * @param mpg		miles per gallon
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	/**
	 * Returns the Make of a vehicle
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * Returns the Model of a vehicle
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns the miles per gallon of a vehicle
	 * @return the miles per gallon (mpg)
	 */
	public int getMpg() {
		return mpg;
	}
	
}