package geometry;

public class Circle extends Geometry2D {
    double radius;

    /**
     * Default Constructor for Circle
     * 
     * @param r radius of a circle
     */
    Circle(double r){
        this.radius = r;
    }


    /**
     * Calculates area of a circle
     * 
     * @return Double area of a circle
     */
    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the circumference of a circle
     * 
     * @return Doubler circumference of a circle
     */
    @Override
    double perimeter() {
        return 2 * Math.PI * this.radius;
    }
    
}
