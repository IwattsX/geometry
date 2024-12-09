package geometry;

public class Rectangle extends Geometry2D {
    double length, width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2.0 * (length + width);
    }
    
}
