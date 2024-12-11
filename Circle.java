/* Subclasses 'Circle' and 'Rectangle' 'extends' from super class 'Shape' 
 * such that those two descendent classes could use the 'area()' & 'toString()' methods from 'Shape' class
 * regardless of which specific subclass is calling them
*/
// 'Circle' subclass "extends" 'Shape' super class, inheriting some members (variables, methods, constructor) from parent class
class Circle extends Shape {
    // declare instance field/variable 'radius'
	double radius;

    // create 'Circle' class constructor
	public Circle(String color, double radius){

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
        // point to instance field 'radius' & assign arg 'radius' value to it
		this.radius = radius;
	}

    // OOP Polymorphism at play here
    // overriding 'area()' method in 'Shape' class w/ 'Circle' class 'area()' method
    /* Recall: Overriding method needs to maintain exact SAME method signature as in parent class -- though functionality may beg to differ */
	@Override double area(){
        // call on Java's built-in 'Math' class from java.lang.* package (implicitly imported) to use .pow() method & .PI property
		return Math.PI * Math.pow(radius, 2);
	}

    // overriding 'toString()' method from 'Shape' class w/ 'Circle' class very own 'toString()' method
    // Once again method signature need to remain same (same access modifier & arguments type + number)
    /* Aside: 'Object' class (super class to all classes in Java implicitly or explicitly) has own .toString() method*/
	@Override public String toString(){
        // 'super.getColor()' calls the .getColor() method from 'Shape' class
        // while 'area()' here calls on the 'Circle' class' 'area()' method as its the overriding one
		return "Circle color is " + super.getColor()
			+ "and area is : " + area();
	}
}

/* honestly to be more modular & to practice separation of concerns, this class could be its own .java or class */
class Rectangle extends Shape {
    // declare instance fields for dimensions
	double length;
	double width;

    // create 'Rectangle' class Constructor
	public Rectangle(String color, double length,
					double width){
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
        // set above instance fields 'length' & 'width' (referenced by 'this' keyword) to args' 'length' & 'width' values, respectively
		this.length = length;
		this.width = width;
	}

    // as 'Rectangle' class "extends" from 'Shape' class so here overriding 'area()' in 'Shape' w/ new 'Rectangle' formula
	@Override double area() { return length * width; }

    // overriding 'Shape' class' 'toString()' method in 'Rectangle' class to account for rectangle shape & area
	@Override public String toString()
	{
		return "Rectangle color is " + super.getColor()
			+ "and area is : " + area();
	}
}