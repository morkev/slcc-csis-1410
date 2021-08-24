package interface_1410;

public class Insect {
	static String species;
	
	/**
	 * Constructs an insect with
	 * a unique parameter: species
	 * @param species of type String.
	 */
	public Insect(String species) {
		Insect.species = species;
	}
	
	/**
	 * Displays a String with class name
	 * with the toString() method.
	 * @return class name
	 */
	public String className() {
		String className = this.getClass().getSimpleName();
		return className;
	}
	
	/**
	 * Getter returns species
	 * @return of type String
	 */
	public static String getSpecies() {
		return species;
	}
	
	/**
	 * Return the defined parameters as
	 * a String, with the following format:
	 * {className: }{species}
	 */
	public String toString(){
		return className() + ": " + species;  
	} 

}