package geometry;

public class Circle extends Geometry2D {
    double radius;
    Circle(double r){
        this.radius = r;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * this.radius;
    }
    
}
