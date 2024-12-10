package geometry;

public class TriangularPrism extends Geometry3D{
    double base, length, height, side1, side2;

    /**
     * Default constructor for TriangularPrism
     * 
     * @param base of a triangle face
     * @param height of the shape
     * @param length of the shape 
     * @param side1 side of a triangle face (NOT BASE)
     * @param side2 side of a triangle face (NOT BASE)
     */
    TriangularPrism(double base, double height, double length, double side1, double side2){
        this.base = base;
        this.length = length;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    /**
     * Calculates volume of a TriangularPrism
     * 
     * @return double volume of a TriangularPrism
     */
    @Override
    double volume() {
        return 0.5 * base * height * length;
    }

    /**
     * Calculates the surface area of a TriangularPrism
     * 
     * @return double surface area of a TriangularPrism
     */
    @Override
    double surfaceArea() {
        return base * height + (base + side1 + side2) * length;
    }
    
}
