package geometry;

public class Sphere extends Geometry3D {
    double radius;

	/**
	 * Default Sphere constructor.
	 * 
	 * @param r The length of the radius
	 */
	public Sphere(double r) {
        this.radius = r;
	}

	/**
	 * Calculates the volume of the Sphere.
	 * 
	 * @return The volume of the Sphere.
	 */
	@Override
	double volume() {
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

	/**
	 * Calculates the surface area of the Sphere.
	 * 
	 * @return The surface area of the Sphere.
	 */
	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 4.0 * Math.PI * Math.pow(radius, 2);
	}

}
