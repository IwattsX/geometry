package geometry;

public class Sphere extends Geometry3D{
    double radius;

    /**
     * Default constructor for sphere
     * 
     * @param r radius of the Sphere
     */
    Sphere(double r){
        this.radius = r;
    }

    
    /** 
     * Calculates Volume of a sphere
     * 
     * @return double volume of the Sphere
     */
    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    /**
     * Calculates the surface area of a sphere
     * 
     * @return double Surface area of a Sphere
     */
    @Override
    double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(this.radius, 2);
    }
    
}
