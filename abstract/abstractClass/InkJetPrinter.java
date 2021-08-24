package abstractClass;

/**
 * Implementation of the methods getRemainingCartridge
 * – have the typical functionality of a getter, and
 * also the creation of models for the product.
 * 
 * @author Kevin Mora
 *
 */
public class InkJetPrinter extends Printer {
	private int remainingCartridge;

	public InkJetPrinter(int sNumber) {
		super(sNumber);
		remainingCartridge = 100;
	}

	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	
	public static String getModel1() {
		String model = "Canon TS202";
		return model;
	}
	
	public static String getModel2() {
		String model2 = "Samsung Xpress";
		return model2;
	}
	
	/**
	 * Returns the <code>remainingCartridge</code>
	 * after calculating the usage of it with
	 * a constant of 10 units. Once the value 
	 * equals zero, it will display: "The cartridge is empty."
	 */
	public void print() {
		for(int k = remainingCartridge; k != 0; k-=10) {
			
			remainingCartridge -= 10;
			System.out.println("InkJetPrinter is printing. Remaining cartridge is " 
			+ getRemainingCartridge() + "%");
			
			if(remainingCartridge == 0) {
				System.out.println("The cartridge is empty.");
			}
		}
	}
}