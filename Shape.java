/* Parent super class which will 'abstracts' away internal intricacies to children subclasses */
// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have the constructor
    /* looks slightly like a setter method in Encapsulation with the setting of this.color = color; 
    does NOT return anything either but method signature does NOT have 'void'
    NVM this is a Constructor --- acts simiar to setter */ 
	public Shape(String color){
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
    /* awfully similar to getter/accessor method in Encapsulation OOP */ 
	public String getColor() { return color; }
}