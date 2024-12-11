/* 'Test' class as the name suggest is to test out the classes & OOP Abstraction (w/ Inheritance ["extends", "super()"], Polymorphism [Overriding methods])
 */
public class Test {
    // standard static main() method --- brain of operations --- where JVM looks to as Java derived from C
	public static void main(String[] args){
        /* create instances of different shapes while
         * declaring reference variables to 'Shape' class to use the numerous 'Shape' members (fields, methods, Constructor)
         */
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

        Shape s3 = new Triangle("Green", 3, 4);

        // default Object(parent of all classes) class method .toString() yields 
        // ClassName & hashCode of that instance (above)
		System.out.println(s1.toString());
		System.out.println(s2.toString());

        System.out.println(s3.toString());
	}
}