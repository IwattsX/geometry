package geometry;

public class Triangle extends Geometry2D {
    double base, height, side1, side2;

    Triangle(double base, double height, double side1, double side2){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return this.base * this.height * 0.5;
    }

    @Override
    double perimeter() {
        return base + side1 + side2;
    }
    
}
