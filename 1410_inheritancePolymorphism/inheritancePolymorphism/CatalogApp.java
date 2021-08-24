package inheritancePolymorphism;

/**
 * Testing class – describes 
 * the efficiency of the code, 
 * and allows us to find errors.
 * 
 * @author Kevin Mora
 */
public class CatalogApp {

	public static void main(String[] args) {
		
		DeskPhone d1 = new DeskPhone(143.0,208.0,119.0,"Model 500","");
		DeskPhone d2 = new DeskPhone(178.0,228.0,127.0,"Cortelco 2500","");
		SmartPhone p1 = new SmartPhone(145.6,68.2,7.9,"Pixel 3",128);
		SmartPhone p2 = new SmartPhone(138.4,67.3,7.3,"iPhone 8",64);
		
			System.out.printf("Various Phones:%n");
			System.out.printf("%s%n%s%n%s%n%s%n",d1,d2,p1,p2);
			System.out.printf("%nArray of elements:%n%n");
			System.out.printf("%s%n%s%n%n",d1,RotaryPhone.call());
			System.out.printf("%s%n%s%n%n",d2,PushButtonPhone.call());
		
		SmartPhone[] smart = { p1,p2 };
		for (SmartPhone d : smart) {
			actAsDog(d);;
		}
	}
	
	private static void actAsDog(SmartPhone d) {
		System.out.println(d);
		Phone.call();
		SmartPhone.browse();
		SmartPhone.takePicture();
		System.out.println();
	}

}