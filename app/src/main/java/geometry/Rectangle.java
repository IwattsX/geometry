package geometry;

public class Rectangle extends Geometry2D {
    double length, width;
    
    /**
     * Default Constructor for Rectangle
     * 
     * @param length of rectangle
     * @param width of rectangle
     */
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates area of a rectangle
     * 
     * @return area of a rectangle
     */
    @Override
    double area() {
        return length * width;
    }

    /**
     * Calculates perimeter of a rectangle
     * 
     * @return perimeter of a rectangle
     */
    @Override
    double perimeter() {
        return 2.0 * (length + width);
    }
    
}
