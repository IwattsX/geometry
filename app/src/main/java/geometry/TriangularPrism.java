package geometry;

public class TriangularPrism extends Geometry3D{
    double base, length, height, side1, side2;

    TriangularPrism(double base, double height, double length, double side1, double side2){
        this.base = base;
        this.length = length;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double volume() {
        return 0.5 * base * height * length;
    }

    @Override
    double surfaceArea() {
        return base * height + (base + side1 + side2) * length;
    }
    
}
