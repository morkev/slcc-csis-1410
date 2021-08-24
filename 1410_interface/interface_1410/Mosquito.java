package interface_1410;

public class Mosquito extends Butterfly{

	/**
	 * Extension of the arguments implemented
	 * in class Butterfly, with no additions.
	 * @param species of type String
	 * @param name of type String
	 */
	public Mosquito(String species, String name) {
		super(species, name);
		Mosquito.name = name;
	}
	
	/**
	 * Displays the specified String,
	 * with the format:
	 * {species}{message}
	 * @return
	 */
	public String buzz() {
		return species + " buzzing around";
	}
	
	/**
	 * Displays the specified String,
	 * with the format:
	 * {message}
	 * @return
	 */
	public String annoy() {
		return "buzz buzz buzz";
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