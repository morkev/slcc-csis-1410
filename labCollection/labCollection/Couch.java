package labCollection;

import java.awt.Color;

/**
 * Object representing a Couch.
 * 
 * @author Kevin Mora
 */
public class Couch {
	Color color;
	Material mat;
	
	/**
	 * Initialization of the fields,
	 * due to the constructor.
	 * @param color
	 * @param mat
	 */
	public Couch(Color color, Material mat) {
		this.color = color;
		this.mat = mat;
	}
	
	/**
	 * Retrieves the couch's color.
	 * @return color of type Color
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Retrieves the couch's material.
	 * @return mat of type Material - ENUM
	 */
	public Material getMaterial() {
		return mat;
	}
	
	@Override
	/**
	 * Makes Couches equal if their 
	 * colors & materials are the same.
	 */
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Couch)) {
			return false;
		}
		Couch c = (Couch) o;
		return c.getColor() == color && c.getMaterial() == mat;
	}
	
	@Override
	/**
	 * Sets the Couch's hashCode.
	 */
	public int hashCode() {
		int matID;
		String colorID = "" + color.getRed() + color.getGreen() + color.getBlue();
		
		if(mat == Material.FABRIC) {
			matID = 0;
		} else if(mat == Material.LEATHER) {
			matID = 1;
		} else {
			matID = 2;
		}
		return matID + Integer.parseInt(colorID);
	}
	
	@Override
	/**
	 * Strings out a description representing the Couch
	 * @return "Couch: {color in hexadecimal} {material}"
	 */
	public String toString() {
		String material = "" + mat;
		String colorHex = String.format("#%02x%02x%02x", 
						  color.getRed(), color.getGreen(), color.getBlue());
		
		return "Couch: " + colorHex + " " + material.toLowerCase();
	}
}