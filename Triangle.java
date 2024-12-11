// 'Triangle' subclass "extends" 'Shape' super class to inherit members (variables, methods, constructor)
public class Triangle extends Shape  {
    // declare some 'Triangle' class instance fields
    int base;
    int height;

    public Triangle(String color, int base, int height){
        // calling 'Shape' constructor
        super(color);
        // indicate 'Triangle' constructor called
        System.out.println("Triangle constructor called");
        // assign args' 'base' & 'height' values to 'Triangle' instance fields 'base' & 'height' (pointed to by "this")
        this.base = base;
        this.height = height;
    }

    /* Note: Without '@Override' label should still be able to work ...*/

    // overriding 'area()' method in 'Shape' class w/ 'Triangle' class 'area()' method to calculate for area of triangle
    double area(){
        // 0.5 floating point number should implicitly convert 'base' & 'height' from int to double type upon calculation
        return((0.5)*base*height);
    }

    // overriding 'Shape' class 'toString()' method to console log out 'Triangle' subclass related material
    public String toString(){
        // invoking super class 'Shape' .getColor() method to retrieve color & call local 'area()' method for triangle's area
        return("Triangle color is " + super.getColor() + " and area of triangle: " + area());
    }
}   
