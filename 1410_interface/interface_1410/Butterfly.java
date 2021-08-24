package interface_1410;

public class Butterfly extends Insect{

	protected static String name;
	
	/**
	 * Extension of the arguments implemented
	 * in class Insect, with the addition
	 * of a new parameter: name.
	 * @param species of type String
	 * @param name of type String
	 */
	public Butterfly(String species, String name) {
		super(species);
		Butterfly.name = name;
	}
	
	/**
	 * Getter returns name
	 * @return of type String
	 */
	public static String getName() {
		return name;
	}
	
	/**
	 * Return the defined parameters as
	 * a String, with the following format:
	 * {className: }{species} {name}
	 */
	public String toString(){
		return className() + ": " + species + " " + name;  
	} 
	
}
