package geometry;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        GeometryLinkedList<GeometryBase> list = new GeometryLinkedList<>();

        list.add(new Sphere(2.0));
        list.add(new Rectangle(2, 4));

        for(GeometryBase obj : list){
            System.out.println(obj.getClass());
        }
    }
}
