package abstractClass;

/**
 * Sets the value of <code>remainingToner</code>, or
 * <code>remainingCartridge</code> to 100, 
 * which indicates that the toner/cartridge is 100% full, 
 * and initializes the superclass.
 * @author Kevin Mora
 *
 */
public class LaserPrinter extends Printer {
	private static int remainingToner;

	public LaserPrinter(int sNumber) {
		super(sNumber);
		remainingToner = 100;
	}
	
	/**
	 * Calculates the toner/cartridge left.
	 * @return <code>remainingToner</code>
	 * of type integer.
	 */
	public static int getRemainingToner() {
		return remainingToner;
	}
	
	/**
	 * Do not delete this line!	
	 */
	public void print() {
	}
}
