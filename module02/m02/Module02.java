package m02;

public class Module02 {

	public static void main(String[] args) {
		// Object initialization
		Object[] list = new Object[] {
				new PowerPlant(100), 
				new WindFarm(6800, false),
				new WindFarm(400, true),
				new HydroPowerPlant(22500, true),
				new HydroPowerPlant(15, false)
		};
		// Printed with for each condition
		   for (Object number : list) {
		      System.out.println(number + "\n");
		   }
		// Printed as an array
		//System.out.println("\n" + Arrays.toString(list));

	    // Sequence printing
		PowerPlant p1 = new PowerPlant(100);
		System.out.println(p1 + "\n");
		WindFarm w1 = new WindFarm(6800, false);
		System.out.println(w1 + "\n");
		WindFarm w2 = new WindFarm(400, true);
		System.out.println(w2 + "\n");
		HydroPowerPlant h1 = new HydroPowerPlant(22500, true);
		System.out.println(h1 + "\n");
		HydroPowerPlant h2 = new HydroPowerPlant(15, false);
		System.out.println(h2);
	}
}
