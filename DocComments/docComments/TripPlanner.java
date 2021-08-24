package docComments;

/**
 * 
 * Creates 4 fields, each with either:
 * departure, arrival, distance, or car Model
 * @author Kevin Mora
 *
 */
public class TripPlanner {
	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	
	/**
	 * 
	 * Requires 4 fields.
	 * departure, arrival, distance, and car Model
	 * 
	 * @param departure		starting location (point A)
	 * @param arrival		final location (point B)
	 * @param distance		distance between point A and point B
	 * @param car			model of the car – e.g. M4 or Civic
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}

	@Override
	/**
	 * Displays the information of both trips in the following format:
	 * {departure} {arrival} {distance} {car model},
	 * such will be substituted by the values of the corresponding fields.
	 * 
	 * NOTE: To get the Model, we will implement  a getter.
	 */
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car="
				+ car.getModel() + "]";
	}

	/**
	 * Returns the String departure – location: start
	 * @return the departure
	 */
	public String getDeparture() {
		return departure;
	}


	/**
	 * Returns the String arrival – location: end
	 * @return the arrival
	 */
	public String getArrival() {
		return arrival;
	}

	/**
	 * Returns the distance between Arrival and Departure
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * 
	 * Calculates the amount of fuel that is required to travel 
	 * from the departure to the destination and return the 
	 * result in full precision (not rounded).
	 * 
	 * FORMAT: Fuel consumption: {fuel consumption} gallons.
	 *
	 * NOTE: We need to convert the integer data type to double
	 * in both, the distance and miles per gallon.
	 * 
	 */
	public double fuelConsumption() {
		double x = getDistance();
		double y = car.getMpg();
		
		double z = (x/y);
		
		System.out.printf("Fuel consumption: %.1f gallons", z);
		return z;
	}
}
