package geometry;

public class TriangularPrism extends Geometry3D {
    // sides of traingle
    double side1, side2, side3;
    double l, h, base;

	/**
	 * Default cube constructor.
	 * 
	 * @param l The length of the cube.
	 * @param w The width of the cube.
	 * @param h The height of the cube.
	 */
	public TriangularPrism(double base, double side1, double side2, double side3, double length, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.l = length;
        this.h = height;
        this.base = base;
	}

	/**
	 * Calculates the volume of the cube.
	 * 
	 * @return The volume of the cube.
	 */
	@Override
	double volume() {
		return 1/2 * base * h * l;
	}

	/**
	 * Calculates the surface area of the cube.
	 * 
	 * @return The surface area of the cube.
	 */
	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return (side1 + side2 + side3) * l + base * h;
	}

}
