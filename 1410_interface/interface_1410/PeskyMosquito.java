package interface_1410;

public class PeskyMosquito extends Mosquito {
	
	/**
	 * Extension of the arguments implemented
	 * in class Mosquito, with no additions.
	 * @param species of type String
	 * @param name of type String
	 */
	public PeskyMosquito(String species, String name) {
		super(species, name);
		PeskyMosquito.name = name;
	}
	
	/**
	 * Displays the specified String,
	 * with the format:
	 * {message}
	 * @return of type String
	 */
	public String bite() {
		return " sucking blood";
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