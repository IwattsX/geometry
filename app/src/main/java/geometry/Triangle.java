package geometry;

public class Triangle extends Geometry2D {
    double base, height, side1, side2;

    /**
     * Default constructor for Triangle
     * 
     * @param base of the triangle
     * @param height of the triangle
     * @param side1 side of the triangle (NOT BASE)
     * @param side2 side of triangle (NOT BASE)
     */
    Triangle(double base, double height, double side1, double side2){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Calculates area of a Triangle
     * 
     * @return double area of a Triangle
     */
    @Override
    double area() {
        return this.base * this.height * 0.5;
    }

    /**
     * Calculates the perimeter of a triangle
     * 
     * @return double perimeter of a triangle
     */
    @Override
    double perimeter() {
        return base + side1 + side2;
    }
    
}
