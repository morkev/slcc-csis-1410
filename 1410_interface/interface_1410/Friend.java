package interface_1410;

public class Friend extends Person {

	private static String hobby;
	
	/**
	 * Extension of the arguments implemented
	 * in class Person, with the addition
	 * of a new parameter: hobby.
	 * @param name of type String
	 * @param age of type integer
	 * @param hobby of type String
	 */
	public Friend(String name, int age, String hobby) {
		super(name, age);
		Friend.hobby = hobby;
	}
	
	/**
	 * Displays a String with 
	 * the name + specified
	 * characters.
	 */
	public void chilling() {
		System.out.println(name + " is chilling");
	}
	
	/**
	 * Return the defined parameters as
	 * a String, with the following format:
	 * {name}({age}) {hobby}
	 */
	public String toString(){
		return name + "(" + age + ") " + hobby.toUpperCase();  
	}

}
