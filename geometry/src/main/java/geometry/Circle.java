package geometry;

public class Circle extends Geometry2D {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    
}
