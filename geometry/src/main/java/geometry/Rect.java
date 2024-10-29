package geometry;

public class Rect extends Geometry2D{
    double length, width;

    public Rect(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return this.length * this.width;
    }
	double perimeter(){
        return 2 * (length + width);
    }
}