package interface_1410;

/**
 * 
 * @author Kevin Mora
 */
public class Person {
	
	protected static String name;
	protected static int age;
	
	/**
	 * Age needs to be a value between 1 and 150 (inclusive). 
	 * Throws an IllegalArgumentException if an invalid age 
	 * is provided and include an error message that states 
	 * that age needs to be from the range [1, 150].
	 * 
	 * @param name of type String
	 * @param age of type integer
	 * @throws IllegalArgumentException
	 */
	public Person(String name, int age) 
		throws IllegalArgumentException {
		
		if (age < 1 || age > 150) {
			throw new IllegalArgumentException
			("ERROR: age needs to be from the range [1, 150]");
		}
	     
		Person.name = name;
		Person.age = age;
	}

	/**
	 * Getters return the defined parameter.
	 * @return the name of type String
	 * @return the age of type integer
	 */
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	/**
	 * Return the defined parameters as
	 * a String, with the following format:
	 * {name}({age})
	 */
	public String toString(){
		return name + "(" + age + ")";  
	}  
	
}
