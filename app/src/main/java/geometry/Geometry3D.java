package geometry;

/**
 * Abstrac class for implementing 3D shapes
 */
public abstract class Geometry3D implements GeometryBase{
	abstract double volume();
	abstract double surfaceArea();
}
