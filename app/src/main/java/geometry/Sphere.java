package geometry;

public class Sphere extends Geometry3D{
    double radius;

    Sphere(double r){
        this.radius = r;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(this.radius, 2);
    }
    
}
