package inheritancePolymorphism;

/************************************************
 * Only positive values are allowed for height, 
 * width, and depth. If one or more of the 
 * parameter values are zero or negative, 
 * an IllegalArgumentException should be thrown.
 * 
 * @author Kevin Mora
 *
 ************************************************/
public class Dimension {
	
	public static double height;
	public static double width;
	public static double depth;
	
	/**
	 * Constructor provides input validation. 
	 * @param height of type double
	 * @param width of type double
	 * @param depth of type double
	 * @throws IllegalArgumentException 
	 * if value is less or equal than 0.
	 */
	public Dimension (double height, double width, double depth) 
		throws IllegalArgumentException { 
			if (height <= 0 || width <= 0 || depth <= 0) {
				throw new IllegalArgumentException
				("The height, width, and depth of a dimension need to be positive.");
		    }
			
	     Dimension.height = height;
	     Dimension.width = width;  
	     Dimension.depth = depth;  
    }

	/**
	 * Implementation of getters.
	 * @return the height
	 * @return the width
	 * @return the depth
	 */
	public static double getHeight() {
		return height;
	}
	public static double getWidth() {
		return width;
	}
	public static double getDepth() {
		return depth;
	}
	
	/**
	 * Method overriding the toString()
	 * Displays the information in: 
	 * ({height} x {width} x {depth})
	 */
	public String toString() { 
		return "(" + height + " x " + width + " x " + depth + ")";  
	}  
	
}
