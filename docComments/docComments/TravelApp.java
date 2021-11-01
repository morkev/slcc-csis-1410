package docComments;

public class TravelApp {

	public static void main(String[] args) {
		System.out.println("Cars:");
		
			Car car1 = new Car("BMW", "M4", 25);
			Car car2 = new Car("Honda", "Civic", 42);
		
		System.out.printf("%s %s %d mph \n", car1.getMake(), car1.getModel(), car1.getMpg());
		System.out.printf("%s %s %d mph \n\n", car2.getMake(), car2.getModel(), car2.getMpg());
		
		
		TripPlanner tripPlanner = new TripPlanner("SF", "LA", 382, car1);
		System.out.println("California Trip: ");
		System.out.println(tripPlanner);
		tripPlanner.fuelConsumption();
			System.out.printf("\n\n");
		
		TripPlanner tripPlanner2 = new TripPlanner("Tampa", "Miami", 280, car2);
		System.out.println("Florida Trip: ");
		System.out.println(tripPlanner2);
		tripPlanner2.fuelConsumption();
	}
}