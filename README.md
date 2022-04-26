## JavaDoc

JavaDoc is a documentation generator from Sun – it generates API documentation in HTML format.
The "doc comment" format is <i>de facto</i> industry standard. They minimize the effort of creating documentation, and make the process of keeping documentation up-to-date or using third-party classes (incl. Java API) easier. They also allow you to hyperlink related documents together.

Structure of a JavaDoc Comment
- Embedded in:    /**    */
- First paragraph ... general description.
- Placed immediately before the documented code.
- Tags that label or classify the description.
	- @param ... parameters of the method
	- @return ... return value of a method
	- @throws ... exceptions the method may throw
	- @author ... who wrote the class/interface

## UML Associations & Multiplicity

Associations show relationships between Classes.

```
ClassA –––––––> ClassB
  Unary Associations
```

```
Unary Associations:
- ClassA knows about ClassB
- ClassB knows nothing about ClassA

Binary Associations:
- ClassX knows about ClassY.
- ClassY knows about ClassX.
```

### Types of Unary Associations:
- Association ... has-a relationship.
- Aggregation ... whole–part relationships.
	- ClassB is part of ClassA.
	- ClassB can exist even if ClassA does not.
- Composition ... whole–part relationships.
	- Describes a whole-part relationship.
	- Life cycle of the part class depends on the whole class.
	- ClassB depends on the existence of ClassA.

### Multiplicity
Specify how many objects are in a relationship.

Instance | Description
--- | ---
0 .. 1 | an optional instance (zero or one)
n | exactly n instances
(*) | zero or more instances
1 .. * | one or more instances
n .. m | n to m instances

## Fundamentals of Programming
- Access modifiers determine who can access a given class or class member – e.g. public, private...
- Class declarations are used to create new types (like a blueprint).
- 'new' is always used in combination with the constructor; it allocates memory for the new object.
- Constructors initialize the new object at the time of creation; its name is the same as the class name and it has no return type.
- Dot operators are used to access class members like methods and constants.
- Objects are an instance of a class (like the actual car). They are needed to access the functionality of instance methods.
- Statements form a complete unit of execution – often terminated with a semi-colon.
- Conditions are boolean expressions – they are either true of false.
- Code blocks can be 0 or more statements enclosed in braces (curly brackets).
- Unified Modeling Language (UML).
- Expressions evaluate to a single value, and are made up of variables, literals, operators, and/or method calls – e.g. 4 + 2, input.nextInt(), length, 3 * width, lastName...
- Getters expose a private field, so it can be accessed from another class – accessors.
- Operation is a term used in UML class diagrams; they correspond to methods and constructors in Java.
- Method headers are the first line of a method declaration.
- Return types specify the type of data the method returns after performing its task (void means no data will be returned).
- Methods are class members that provide functionality (they do something).
- Setters provide a way for other classes to change private fields – mutators.
- Instance variables are fields that belongs to an instance (object) of a class.
- Parameters are used like local variables but passed to a method or constructor; they provide information (data) that is needed to perform a specific task (they provide functionality).
- Parameter lists are a list of zero or more parameters that are enclosed in parenthesis.
- Attribute is a term used in UML class diagrams to define the state (data) of a class.
- Local variables are only available within the method where they are declared – they are used to store a value temporarily.
- Fields are variables that declared inside a class but outside of a method; they are used to implement the attributes of a class.

## Class String

```java
String tree = "oak";
// How would you return the second letter ('a')?
char ch = tree.charAt(1);

// Assume two variables have been declared:
String word1 = "house";
String word2 = "dog";

// Result of the following method:
word1.concat(word2)
// A new string "housedog" is returned

// Assume you initialize a String variable called word.
// Which of the following statements gives you the length of the string?
int length = word.length();
```

```java
char[] nArray = {'B','e','n'};
String name = new String(nArray);

// Use methods from class String to complete the method printReverse:

private void printReverse (String str) {
    for (int i = str.length() - 1; i >= 0; i--) {
        System.out.print(str.charAt(i));
    }
}
```

### Class StringBuilder

Such objects are like String objects, except that they can be modified.
They are frequently used for creating and manipulating string information that needs to be changed dynamically.
Like a variable-length array that contains characters.

Capacity specifies how many characters can be stored.
The capacity default size is 16.

```java
StringBuilder sb = new StringBuilder();
sb.append("hello");

// What is the capacity of sb? 
// Default: 16.
```

charAt(int index) allows us to read a character at a given index.

Prefer class String unless:
- StringBuilder leads to simpler code
- StringBuilder has better performance

StringBuilder has a number of overloaded methods – all of them have the same return type: StringBuilder.
StringBuilder has methods to replace, read, reverse, modify, or substring.

## JUnit

JUnit is a framework to write and run repeatable tests in Java.

Provides:
- An assertion library to evaluate test results.
- Applications to automatically run the tests you created.

Advantages:
- No human judgement required – avoid scroll-blindness
- Easy to run many tests repeatedly  – catch regression

Key features when creating and running jUnit tests:
- Add tests incrementally
- Update tests whenever bugs are found
- Run automatically 
- Visual feedback
- Evaluated automatically 
- Entire code base or subset

In jUnit 4 each unit test has the annotation @Test right before the method declaration.

The assertEquals method that compares an actual value of type  double with an expected value has a third parameter called delta. This  third parameter specifies how big the difference between the expected  and the actual values can be while still being considered equal. 

If the following method is declared it is executed before each of the unit tests. Which method is it?
- setUp

Which of the following makes sure that an expected exception (MyException) is thrown? 
- Add a parameter to the annotation - like this:
```java
@Test(expected = MyException.class)
```

In order to identify appropriate test data, we use a technique called equivalence partitioning. It is a technique that divides the input data into groups of equivalent data called equivalent partitions. These partitions are used to derive test cases that uncover classes of errors. In order to provide adequate test coverage, each of the equivalence partitions should be covered in at least one of the JUnit tests.

There are a number of popular naming conventions for JUnit tests:

```java
- MethodName_StateUnderTest_ExpectedBehavior 
- Example: isLeapYear_YearIsMultipleOf4ButNotOf100_True
```

## Abstract Methods & Classes

Abstract Methods/Classes are methods/classes that are declared with the keyword abstract.
- Abstract Classes may or may not include abstract methods.
- Abstract Classes are intended to be subclassed.
- Abstract Classes cannot be instantiated – methods might not be implemented.
- Abstract Classes are always used in the context of inheritance.
- Subclasses must implement all abstract methods, unless they are declared abstract too.
- Abstract Methods have no method body.
- Abstract Methods can be only declared in abstract classes (or interfaces).

```java
// EXAMPLE
public abstract void draw();
```

Static methods are never declared abstract, because static methods belong to the data type – they are thus not inherited.
Similarly, constructors can't be declared abstract either.

When to use abstract classes?
1. When we need to include some implementation or fields.
2. When we need to specify what is in common among subclasses.
3. When we need to model an "is-a" relationship between classes.
4. When we need to prevent the class from being instantiated itself.

## Final Methods & Classes

- Final Methods cannot be overridden in a subclass.
- All subclasses use the same method implementation, which provides consistency.
- Private and Static methods are implicitly final.
- Calls to final methods that are resolved at compile time –> static binding.
- Final classes and methods are efficient, secure, and consistent.

### Final Classes
- Final classes cannot be extended.
- All methods in a final class are implicitly final.
- Final classes are often used for efficiency, or security reasons.

### Concrete Classes

Concrete Classes provide implementation for every method they declare and for every abstract method they inherit, and they can also be instantiated.

## Inheritance
Mechanism that allows us to model a relationship between classes where one class is-a special kind of another class.
- EXAMPLE: A ToggleButton is a special kind of Button.

The purpose for inheritance is a dynamic binding which provides flexibility. It is also a form of software reuse. A new class is created by absorbing the class members of an existing class. Existing functionality can be modified and new functionality can be added.

Is-a relationship represents inheritance.
An object of a subclass can be treated as an object of its superclass.
```java
// Examples:
a student is-a person
a polygon is-a twoDimensionalShape
a college is-an educationalnstitution

Subclass: student, polygon, and college.
Superclass: person, twoDimensionalShape, educationalnstitution.
```

One superclass can have multiple subclasses.
Each subclass has exactly one direct superclass – single inheritance.
Subclasses can have multiple classes.
Each class has exactly one direct parent class (superclass).

Subclasses inherit all the public and protected members (fields, methods, and nested classes) from its superclasses.
Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
Subclasses can add their own members – e.g. fields, methods, etc.
The superclass can overridde (redefine) an inherited superclass method with an appropriate implementation.

If no superclass is specified, the class implicitly derives from class Object.
The class Object is at he top of the class hierarchy tree. Every class is a descendant, direct or indirect, of the Object class. Every class inherits the instance methods of Object.

```
// INHERITANCE CHAIN

ClassA <-- ClassB <-- ClassC <-- ClassD
Animal <-- Mammal <-- Bear <-- Grizzly

ClassB is subclass from ClassA.
ClassB is a superclas from ClassC.
```

## Java Access Modifiers

- public ... accessible to any class.
- private ... accessible only within the class itself.
- protected ... accessible within its own class, within its subclasses, and within other classes in the same package.
	- useful to grant access to certain methods 
	– fields should remain private.
	- created for flexibility and control
	– allows to change implementation methods
	– input validation – i.e.read only
	- for data integrity 
	– any subclass can modify protected fields

Methods, fields, .. retain their original access modifier when they are inherited by the subclass.

### Subclass Constructors
- They are not inherited 
- The first task of a subclass constructor is to call the constructor of its direct subclass (explicitly or implicitly).
- If the superclass has a default or no-argument constructor, Java can call it implicitly.

Every class you declare without specifying any inheritance relationship directly derives from Object. Whenever you declare a constructor the very first task in the constructor is not to execute the first specified statement, but to call the constructor of Object – constructor of superclass. 

Super-class constructor call syntax:
super + argument list of super-class constructor.
super ( . . );    //must be the first statement

Overriding Methods
Always use the annotation @Overridde when you modify an inherited method in a derived class.

Advantages:
- Catches errors in the method signature (misspelled name, incorrect parameter list).
- Makes your code more clear to programmers.

## Polymorphism

Polymorphism is the characteristic of being able to assign a different meaning or usage to something in different contexts – specifically, to allow an entity such as a variable, a method, or an object to have more than one form. Enables you to write programs that process objects that share the same superclass as if they were all objects of the superclass.

Three pillars of Object Oriented Programming:
1. Encapsulation 
2. Inheritance
3. Polymorphism 

---
### Polymorphism & Interfaces
Polymorphism enables you to deal in generalities and let the run-time environment handle the specifics. You can tell objects to be have in manners appropriate to those objects, without even knowing their types – as long as the objects belong to the same inheritance hierarchy or they implement the same interface.

- Interfaces allow objects of unrelated classes to be processed in a polymorphic way.
- If a class implements an interface, all objects of the class provide the functionality described by the interface, and all objects of that class have an is-a relationship with the interface type. That is also true for all subclasses of that class, because interfaces are public.
- Polymorphism facilitates the design and implementation of extensible systems.
- Software that invokes polymorphic behavior is independent of the object types to which messages are sent.
	- New derived classes can be added with little or no modification to the general portions of the program.
	- Only those parts that require direct knowledge of the new classes need to be modified

---
### Polymorphic Behavior
Virtual Method Invocation – The Java virtual machine (JVM) calls the appropriate method for the object that is referenced in each variable, not the method defined by the variable's type. The type of referenced object, not the type of the variable, determines which method is called.

When we create a superclass variable and assign a subclass object, invoking an overridden method on that variable invokes the subclass behavior.
Therefore: 
- Which methods are accessible depend on the type of the variable.
- Which specific method is executed depends on the type of the instance that is referenced.

---
### Downcasting

When you treat a variable of the superclass as an instance of the subclass.
```java
ClassB varB = (ClassB) varA;
// varB is a subclass variable
// varA is a superclass variable

// Works, because a1 is an instance of Bird
Animal a1 = new Bird();
Bird myBird = (Bird) a1;

// Fails, because a2 is not instance of Bird.
Animal a2 = new Fish();
Bird myBird = (Bird) a2;

// Might or might not work.
Animal a3 = getSomeAnimal();
Bird myBird = (Bird) a3;
```

The '<i><b>instanceof</b></i>' operator helps us ensure that the instance is of the right type.
```java
Animal a3 = getSomeAnimal();
if (a3 instanceof Bird)
    Bird myBird = (Bird) a3;
```
<b>Dynamic Binding</b>: all calls to overridden methods are resolved at run time.

## Promotion

TYPE | SIZE | VALID PROMOTION
--- | --- | ---
double | 8 bytes | -
float | 4 bytes | double
long | 8 bytes | double, float
int | 4 bytes | double, float, long
char | 2 bytes | double, float, long, int
short | 2 bytes | double, float, long, int, (not char)
byte | 1 byte | double, float, long, int, (not char), short
boolean | | -

## Interfaces
- Interfaces form a contract.
- Enforced at compile time.
- If your class implements an interface, it includes implementations for all methods declared in that interface.
- Interfaces allow you to treat unrelated classes polymorphically.
- Using the same signature for the same functionality makes your code more clear and easier to read.

<b>How to use interfaces:</b>
1. Declare a new interface that describes the desired functionality.
2. Implement this interface in classes that require that functionality.
3. Use interface as a type.

One of the most commonly used interfaces is the interface Comparable (compareTo). It has a method that compares two elements – this allows us to establish an order between elements, which in turn enables us to sort elements of the given type.

Java interfaces are reference types, and cannot be instantiated.
Interfaces are implicitly abstract.

### Interface Members
- Constants (implicitly public, static & final).
- Abstract / default / static/ private methods (methods that are declared in a Java interface are assumed to be public and abstract unless specified otherwise).
- Nested types.

### Interface Declaration
```java
// They look like a class declaration, but with "interface" instead of "class."
// They are thus PascalCased.
// Often adjectives or nouns – Comparable, AutoCloseale, List, Set, etc.
public interface InterfaceName {
    // interface members
}

// An interface can extend multiple intefaces
public interface Interface_C 
            extends Interface_A, Interface_B {
    // optional additional interface members
}

// Example of programming to an interface:
List<String> wordList = new ArrayList<>();
```

### Overriding Rules
- A method declared final cannot be overridden. 
- A method declared static cannot be overridden but can be re-declared. 
- If a method cannot be inherited, then it cannot be overridden. 
- A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
- Allows the compiler to catch errors in the method signature and it makes the code more clear.
- Interface members that should be overridden: all abstract methods and optionally default methods.

### Relationships
- Class interface "is-a" relationship between classes.
- Implementing an interface "is-a" relationship between a class and an interface.
- Extending an interface "is-a" relationship between internships

## Class Object

Is the root of class hierarchy.
The methods of class Object can be called on arrays.       

Object has 11 methods:
- 5 can be overridden 
	- clone, equals, finalize, hashCode, toString
- 6 final methods
	- getClass – return the runtime class of this Object
- 5 final methods used in connection with threads
	- notify, notifyAll, wait (overloaded 3 times)

It's important to follow that contract , because other classes rely on the proper implementation of these methods.
Whenever 'equals' is overridden, 'hashCode' needs to be overridden as well.

```java
// Assume you have two Circle objects c1 and c2.
// You know that c1.equals(c2) returns false. Is the following statement true or false?
Given that 
c1.equals(c2) returns false,
we can be certain that:
c1.hashCode() is different from c2.hashCode().

// This is false
```

## Graphical User Interface

Characteristics we should strive for in order to make GUIs user-friendly.
- Consistent
- Easy to navigate
- Intuitive
JOptionPane is class used in Swing to create dialogs.
In relation to dialogs, the word modal stands for the ability of blocking user input to all other windows when visible.

<b>Reminder:</b>
AWT components are heavyweight components that display differently on different platforms.
Swing components are lightweight components that allow a uniform look and feel across different platforms.

```
- Containers are components that can contain other components.
- Components are objects that can be displayed on the screen and that can interact with the user.
- JComponent is a superclass of all lightweight Swing components.
```

Many programs call the method setDefaultCloseOperation from JFrame and pass a static constant to ensure that the application is terminated when the user presses the x button on the top right of the window. EXIT_ON_CLOSE provides this functionality.

- JFrame provides the basic attributes and behavior of a window – a title bar and buttons to minimize, maximize and close the window. 
- Labels can display text and / or an image.
- JComponents must be placed inside a top-level container e.g. – JFrame, JDialog, or JApplet.

---
### Event Handling 

GUIs are event driven.
- Event: something significant that happens (click a button).
- Event Handler: the code that performs a task in response to an event.
- Event Handling: overall process of responding to events.

How to respond to an event?
1. Create an event handler class.
2. Implement the appropriate event-listener interface.
3. Register the event handler object.

<b>Nested Classes</b>
- They are declared inside other classes.
- They can be static or non static.
- Non-static nested classes are called inner classes and are frequently used to implement event handlers.

<b>Inner Classes</b>
- Before an object of an inner class can be created, there must be an object of the class that contains the inner class. Why? The inner-class object has implicitly a reference to an object of the top-level class.
- The inner-class object can directly access all the variables and methods of the outer class.
- Event handlers are often declared private because they tend to be specific to the class in which they are defined.

You need to write some code that responds to a text change in a JTextField. How can you do that?        
- Create a class that implements the interface ActionListener and override the method actionPerformed

---
### Layout Managers

Swing provides several layout managers that determine the positioning of your components.

Method setLayout is inherited from class Container. Arguments must be an object of a class that implements he LayoutManager interface (e.g., FlowLayout).

Layout managers calculate the sizes for a container and they lay out the container's children.
GridLayout: This LayoutManager layouts out components in the form of a table where identical components are placed in specific cells. NOTE: the container is divided into equal-sized rectangles, and one component is placed in each rectangle.

FlowLayout: This LayoutManager lays out components row by row. If the window gets resized and the components no longer fit in a row, the components get moved to the next row and the next, etc.

SwingConstants provides an interface that includes constants that are used in combination with Swing GUI.

## Auto-boxing, Unboxing & Wrapper Classes

Auto-boxing is the automatic conversion that the Java compiler makes between a primitive type and its corresponding object wrapper class.
Unboxing is the reverse process of boxing. It converts an instance of a wrapper class to its corresponding primitive type.
Wrapper Classes have the exact same scope as the primitive type, and they are of type reference.
The Java API provides a wrapper class for each of the 8 primitive types.

Reasons to use wrapper classes: 
- To use Generic Collections
- Access useful functionality provided by wrapper class members

```java
01  List<Integer> numbers = new ArrayList<>();
02  numbers.add(25);17798sysout
03
04  int[] intArray = new int[3];
05  intArray[0] = 25;
06
07  intArray[1] = numbers.get(0);

// 02 is an example of auto-boxing
// 05 is an example of neither
// 07 is an example of unboxing
```

```java
// This is an example of auto-boxing
int numberA = 3;
Integer numberB = numberA;
```

## Class Collections

All the methods in class Collections operate on or return collections.
All the methods in class Collections are static.
 
Sort method:
- The second parameter lets you define how the collection should be sorted - for example in reverse order 
- Class Collections includes two sort methods. One takes one parameter, the other two. 
- Sort returns nothing but it changes the collection that was passed as an argument

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Collections.fill(numbers, 7);
System.out.println(numbers);
    // OUTPUT: [7, 7, 7, 7, 7]
    // Replaces all elements of the list with the specified type.
```

```java
List<Character> letters = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
Collections.sort(letters, Collections.reverseOrder());
System.out.println(letters);
// OUTPUT: [u, r, o, n, d, a]

List<Character> letters = Arrays.asList('a', 'r', 'o', 'u', 'n', 'd');
Collections.reverse(letters);
System.out.println(letters);
// OUTPUT: [d, n, u, o, r, a]
```

## Generic Collection

A Collection is an object that can hold references of other objects.
Some of the methods in interface Collection are marked as (optional operation) – that means those methods are mutators.
If the collection does not provide the optional operations, then it will throw an UnsupportedOperationException.

What can you do by calling a method from interface Collection?
- Add an element.
- Remove all elements.
- Check whether there are no elements in the collection.
- Check whether an element is included in the collection.

```java
Assume you need a collection of whole numbers. Which of the following statements best describes your situation?
// Primitive types cannot be stored in collections, but you can use the corresponding wrapper class.
```

ArrayList allows you to create an instance of a list that provides efficient random access. 
LinkedList allows you to create efficient insertion in the middle.
Vector is synchronized by default – good for multi-threading.

What can you expect if you call such a method?
- List: ordered collections.
- Map: matches key to values.
- Queue: holds elements prior to processing.
- Set: collection without duplicates.

Raw types are generic classes or interfaces without any type of arguments – e.g. List list1, or ArrayList list2.
Raw types are allowed because of legacy reasons, however, they should be avoided in new code.

ArrayList | LinkedList
--- | ---
Random access (with index). | Only sequential access of elements.
Uses dynamically resizing array to implement List. | Uses doubly-linked list to implement List.

## Lambdas

Lambdas are succinctly expressed single method classes that represent  behavior. They can either be assigned to a variable or passed around to  other methods just like we pass data as arguments.
You’d think we’d need a new function type to represent this sort of  expression. Instead, Java designers cleverly used existing interfaces  with one single abstract method as the lambda’s type.

They represent behavior.
They can be assigned to a variable.
They can be passed to methods as arguments.

Why should we use lambdas?
- Enables functional programming – an interface with exactly one abstract method.
- Enables support for parallel processing.
- Produces clear and concise code.

```java
// This lambda exppression contains 2 arguments
(s1, s2) -> s1 + s2
// This lambda exppression contains 1 argument
x -> x - x
// This lambda exppression contains 0 arguments
( ) -> doSomething( )
```

As Java is a strongly typed language, it is usually mandatory to declare types; otherwise, the compiler laughs at us.
What  is the type of a lambda expression? Is it a string, an object, or a new functional type?
Fortunately, there is no new addition to the type system—the designers of Java did not introduce any special type to represent lambda expressions. Instead, they cleverly re-used the existing anonymous method strategy. We’re already familiar with anonymous classes, so  picking up this new representation should be relatively straight  forward.

A functional interface is a special interface with one and only one  abstract method. It is exactly the same as our normal interface, but with two additional characteristics:
- It has one and only one abstract method.
- It can be decorated with an optional @FunctionalInterface annotation to be used as a lambda expression – this is strongly suggested.

Java has numerous single method interfaces. These are all retrofitted, making them functional interfaces. If we want to create our own, all we need to do is to define an interface with one abstract method and stick a @FunctionalInterface annotation on top of it! For example, the following code fragment defines an "IAddable" interface. This is a functional interface whose job is to simply add two identical items of type T.

```java
@FunctionalInterface
public interface IAddable<T> {
    // To add two objects
    public T add(T t1, T t2);
}
```

Which of the following us not a valid lambda expression.
```java
// This expression is valid
(n1, n2) -> { n1++; return n1 - n2; }
// This expression is valid
count -> count++
// This expression is valid
( ) -> sendAnEmail( )
// This expression is not valid
(String s1) -> s1 * s1;
```

Lambda documentation: https://www.oreilly.com/content/whats-new-in-java-8-lambdas/

## Generic Methods

Generic methods are methods that introduce their own type parameters.
The scope of the type parameter is limited to the method where it is declared.
```java
public < T > void printArray (T[ ] array)
{ ... }

public <T> void swap (T[ ] array, int index1, int index2)
{ ... }

// The type <T> has to be of Reference type – Generic and Primitive types are not allowed.
```

Type parameters are single, uppercase letters.
A method that introduces its own type parameter is a generic method.       
Commonly used type parameter names:
- E – Element (e.g. in collections)
- K – Key
- T – Type
- V – Value
- S, U, V, ... – additional types.
NOTE: The type parameter section is surrounded by < >.

### Generic Type
A generic type is a class or an interface that has been declared with one or multiple type parameters.       
Generic type parameters can be restricted to a group of types that implement a given interface. You can do that by using the keyword 'extends.'
```java
class name < T >
{ ... }

class name < T1, T2, .., Tn >
{ ... }
```

## Bounded Types

<T> can stand fro any reference type
Functionality restricted to Object methods.
Bounded types restrict the types that can be used as type arguments in a parameterized type – e.g. <T Extends Number>, or <T extends Comparable <T>>.
When comparing bounded types with unbounded types you will find that bounded types restrict the types that can be used as type arguments. At the same time they expand the functionality that is available for implementation.

```java
// Assume you have 2 classes: Square and Rectangle.
// Square is a subclass from Rectangle, which means Square is-a Rectangle.

// The following conclusion is incorrect:
List<Square> is-a List<Rectangle>

// ----------------------------------

// Assume the following:
ClassB myB = new ClassB();
ClassA myA = myB;

List<ClassB> bList = new ArrayList<>();   // is correct
List<ClassA> aList = bList;               // is incorrect
```

## WildCards & Erasure

In generic code, the wildcard (?) represents an unknown type.
Wildcards can be used in variable declarations (instead of a type parameter).
Wildcards can be upper-bounded and lower-bounded.

Upper-bounded wildcards are used to relax restrictions on a variable.
The unknown type is either upperBound or a subtype of upperBound.
```java
? extends Number 
// apply on abstract classes, and interfaces
```

Lower Bounded Wildcards
Used to relax restrictions on a variable
```java
? super lowerBound
// the unknown type is either lowerBound, or a super type of lowerBound
```

When do I specify Upper Bounded Wildcards?
- When I need to call certain methods that are declared in a given class or interface.
- The sub classes will inherit the methods – they will still be able to provide that functionality

When do I specify Unbounded Wildcards?
- When functionality can be provided by Object class ( -> by any class)
```java
void printList (List<?> list)
```

When do I specify Lower Bounded Wildcards?
- When I need to add elements of a given type to a collection.
- The elements have an is-a relationship to the super class, because of that they can be added.
```java
void append (List<? super Number> numbers, Number n) {
    numbers.add(n);
}
```

Keyword 'extends' can be applied to both, super classes and interfaces.
A wildcard can have only one bound, either a lower bound or an upper bound. 

Type Erasure 
Is the process of removing generic type information after the compiler had already checked for type-correctness.
```java
List<Integer> will be converted to type List
```

The Java compiler applies type erasure like this:
	It replaces all type parameters in generic types with bounds (or Object).
	It inserts type casts to preserve type safety
	Generates bridge methods to preserve polymorphism in extended generic types.

Erasure is the process of removing generic type information after the compiler had already checked for type correctness.

## Class File

Is an abstract representation of file and directory pathnames – Class File is really a Path.
A path specifies the location of a file/directory on disk.

### Absolute path
- Starts with root directory
- e.g.: C:/temp/data.txt
- e.g.: C:/practice/HelloWorld.java
Relative path
- Typically represents at the directory in which the application began its execution
- A path relative to the current directory
- e.g.: date.txt

```java
// Assume you have a variable demo that is declared like this:

File demo = new File("C:\\Demo");

// You want to find out whether demo is a directory?
// Which expression should you use?

demo.isDirectory()
// I would put this line within a for each loop structure.
```

```java
// Assume you need to print all the file names of a given directory, where the file is greater than 100K.
// Which method should you use to access the content of the given directory?
listFiles()
```

## Files & Streams

A file is a collection of data or information that has a name and is stored on a secondary storage device – files are used to persist data.
Types of files:
	Text files (character based)
	Binary files (image files, data files)
	...
	
A stream represents a sequence of bytes, which can be accessed in sequential order.
The data that represented by a stream can come form different sources and can go to different destinations.
Analogy: pipeline or a conveyor belt.
	Input stream ... you take items coming toward you.
	Output stream ... you put items on the conveyor belt.

Java creates 3 stream objects when a program begins:
- System.in
-	System.out
-	System.err
	
––> All these streams can be redirected with the methods setIn, setOut, and setErr.

## File Input with Class Scanner

- Scanner is a simple text scanner that can parse primitive types and strings.
- Breaks its input into tokens using a delimiter.
- Tokens are then converted into values of different types using various next methods.
- Scanner is often used to read inout from the keyboard, and it can also be used to read input from a file.
- Scanner does not allow repositioning to beginning of the file (program must close the file and reopen it).

The try-with-resources statement is a try statement that declares one or more resources.
It ensures that each resource is closed at the end of the statement.
Any object that implements AutoClosable can be used as a resource.

```java
Scanner (InputStream source)
e.g. – System.in
// Constructs a new Scanner that produces values scanned from the specified input stream.

Scanner (File source)
e.g. – new File("C:\\MyFile.txt")
// Constructs a new Scanner that produces values scanned from the specified file.

NOTE: Linux and macOs use // instead of \\.
```

```java
// What happens if you call the method nextDouble() but the next token that is read is "hello"?
an InputMismatchException is thrown
```

Try-with-Resources
https://www.baeldung.com/java-try-with-resources

## Cohesion

High cohesion is when you have a class that does a well defined job. Low cohesion is when a class does a lot of jobs that don't have much in common.

Let's take this example:
You have a class that adds two numbers, but the same class creates a window displaying the result. This is a low cohesive class because the window and the adding operation don't have much in common. The window is the visual part of the program and the adding function is the logic behind it.

To create a high cohesive solution, you would have to create a class Window and a class Sum. The window will call Sum's method to get the result and display it. This way you will develop separately the logic and the GUI of your application.

An explanation of what it is from Steve McConnell's, "Code Complete":

> Cohesion refers to how closely all the routines in a class or all the code in a routine support a central purpose. Classes that contain strongly related functionality are described as having strong cohesion, and the heuristic goal is to make cohesion as strong as possible. Cohesion is a useful tool for managing complexity because the more code in a class supports a central purpose, the more easily your brain can remember everything the code does.

Achieving cohesion, from Uncle Bob's "Clean Code":

> Classes should have a small number of instance variables. Each of the methods of a class should manipulate one or more of those variables. In general the more variables a method manipulates the more cohesive that method is to its class. A class in which each variable is used by each method is maximally cohesive. In general it is neither advisable nor possible to create such maximally cohesive classes; on the other hand, we would like cohesion to be high. When cohesion is high, it means that the methods and variables of the class are co-dependent and hang together as a logical whole.


The notion of cohesion is strongly related with the notion of coupling; also, there is a principle based on the heuristic of high cohesion, named Single Responsibility Principle (the S from SOLID).

![cohesion](https://user-images.githubusercontent.com/83437383/130538021-33512242-8246-4475-bc83-4c554a208602.png)

High cohesion is a software engineering concept. Basically, it says a class should only do what it is supposed to do, and does it fully. Do not overload it with functions that it is not supposed to do, and whatever directly related to it should not appear in the code of some other class either. Examples are quite subjective, since we also have to consider the scale. A simple program should not be too modularized or it will be fragmented; while a complex program may need more level of abstractions to take care of the complexity.

## Exception Handling

- Deals with problems that occur during runtime.
- Provides information about the existing problem.
- Allows you to take appropriate action.
- Makes code more fault-tolerant and robust.

### Stack Trace
```java
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100    // name of exception
     at Erathostenes.initialize(Erathostenes.java:33)                       // (at) method call stack ––> exception in method initialize, class Erathostenes, line 33.
     at Erathostenes.getPrimeNumbers(Erathostenes.java:12)                  // (at) method call stack
     at ErathostenesApp.main(ErathostenesApp.java:6)                        // (at) method call stack

// This is an example of a Throw point:
// (at) method call stack ––> exception in method initialize, class Erathostenes, line 33.

// NOTE: if it states (Unknown source), then the exception belongs to the Java API – not available in the JVM.
```

```java
The result of dividing one floating point number by zero is "Infinity."
The result of dividing one integer number by zero is an "ArithmeticException."
```

## Catching and Handling Exceptions

Try statements help us respond to a runtime problem before a stack trace is presented to the user.
```java
try {
    ... // includes code that could throw an exception ––> exactly 1 try block
} catch (ExceptionType1 ex) {
    ... // catches and handles an exception ––> 0-n catch blocks
} finally {
    ... // executes always ––> 0-1 finally blocks
}

NOTES:
// Max. 1 "catch block" is executed.
// The finally block is executed regardless whether an exception has been thrown or not.

QUESTION:
// It can happen that multiple catch blocks on a try statement 
// are executed to handle a given exception? FALSE.
```

### Uncaught Exceptions

- Uncaught exceptions will terminate the thread where the exception occurred.
- Uncaught exceptions are exceptions that have no matching catch block.
- In case of a single threaded application this will terminate the application.

### Termination Model

If an exception occurs in a try block the remaining statements of the try block are no longer executed.
The execution continues in the first matching catch block (if there is one).
If the exception was handled in the catch block the execution resumes after the try statement.


### Checked Exceptions
- Only objects of type Throwable can be used with the exception handling mechanism.
- Errors indicate a serious problem that programs typically can't recover from.

PROBLEM | HOW TO SOLVE
--- | ---
Error | Don't try catching it
RuntimeException | Fix the code
Exceptions that are not RuntimeExceptions | Catch or declare

## Serialization

Is the process of converting an object into a stream.
Deserialization is the process of reconstructing an object that has been serialized before.

Why serialize?
- To clone an object
- To store data / state of an object
- To transmit data / state of an object

To create a serialized object in a file, create an ObjectOutputStream with a FileOutputStream
- FileOutputStream: Writes binary data to a file (takes a sequence of bytes and writes it to a file).
- ObjectOutputStream: Converts a Java object (or a primitive type) to a sequence of bytes and writes it to an OutputStream (takes an object and converts it to a sequence of bytes).– e.g. FileOutputStream, ByteArrayOutputStream, etc.

```java
Serialization
new ObjectOutputStream(new FileOutputStream("myFile.ser"))
// object –> sequence of bytes –> file

Deserialization
new ObjectInputStream(new FileIinputStream("myFile.ser"))
// file –> sequence of bytes –> object
```

To re-create an object from a file, create an ObjectInputStream with a FileInputStream.
- FileInputStream: reads binary data from a file (reads a file and converts it into a sequence of bytes).
- ObjectInputStream: reads a sequence of bytes from an InputStream and reconstructs a Java object or a primitive type from that data (takes a sequence of bytes and converts it to an object).

If a field is declared as transient, then such will be ignored during serialization
If a class wants to have its state serialized or deserialized it needs to implement the interface Serializable.
Serialization does not only apply to objects – primitive types are allowed.
