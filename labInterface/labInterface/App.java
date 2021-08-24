package labInterface;

public class App {

	/**
	 * Displays all the information,
	 * and helps us test the functionality.
	 */
	public static void main(String[] args) {
		System.out.println(buildArray());
	}
	
	/**
	 * Creates new objects,
	 * and displays them in order.
	 * @return
	 */
	private static Object buildArray(){
		   String objects = new Plane(4, "Boing 747")
		   		   + "\n" + new Hangglider("Rigid-wing", true)
		   		   + "\n" + new Bird("Swallow");
		   
		   return objects;
	}
}