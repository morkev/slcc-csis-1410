package abstractClass;

/**
 * Abstract class Printer with
 * fields and constructors with
 * the purpose of displaying the
 * correct format:
 * 
 * {printer type} {serial number}
 * 
 * @author Kevin Mora
 *
 */
public abstract class Printer {
	/**
	 * Private field initializing
	 * the Serial Number.
	 */
	private int serialNumber;
	
	/**
	 * Constructor responsible of setting 
	 * up the <code>serialNumber</code>.
	 * @param number of type integer.
	 */
	public Printer(int number) {
		serialNumber = number;
	}

	public abstract void print();
	
	/**
	 * Printer display format.
	 */
	public String toString() {
		return this.getClass().getSimpleName() 
				+ ": #" + serialNumber;
	}
}