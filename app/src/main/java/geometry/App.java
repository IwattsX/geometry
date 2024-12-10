package geometry;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    /**
     * Main function that implements a REPL
     * 
     * @param args
     */
    public static void main(String[] args) {
        GeometryLinkedList<GeometryBase> list = new GeometryLinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\nDo you want to add, remove, find, or exit?");
                System.out.println("Menu:\n1. Add\n2. Remove\n3. Find\n4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addShape(list, sc);
                        break;
                    case 2:
                        removeShape(list, sc);
                        break;
                    case 3:
                        findShape(list, sc);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                sc.nextLine(); // Clear the scanner buffer
            }
        }
        sc.close();
    }
    /**
     * Adds a shape to a linkedList
     * 
     * @param list the linkedList
     * @param sc scanner for user input
     */
    private static void addShape(GeometryLinkedList<GeometryBase> list, Scanner sc) {
        System.out.println("Which shape do you want to add?");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Rectangular Prism\n5. Triangular Prism\n6. Sphere ");
        System.out.print("Enter your choice: ");
        int shapeChoice = sc.nextInt();

        switch (shapeChoice) {
            case 1 -> {
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(radius));
            }
            case 2 -> {
                System.out.print("Enter length and width separated by spaces: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                list.add(new Rectangle(length, width));
            }
            case 3 -> {
                System.out.print("Enter base, height, and two side lengths separated by spaces: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double side1 = sc.nextDouble();
                double side2 = sc.nextDouble();
                list.add(new Triangle(base, height, side1, side2));
            }
            case 4 -> {
                System.out.print("Enter length, width, and height separated by spaces: ");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                list.add(new RectangularPrism(length, width, height));
            }
            case 5 -> {
                System.out.print("Enter base, height, length, side1, and side2 separated by spaces: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double length = sc.nextDouble();
                double side1 = sc.nextDouble();
                double side2 = sc.nextDouble();
                list.add(new TriangularPrism(base, height, length, side1, side2));
            }
            case 6 -> {
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                list.add(new Sphere(radius));
            }
            default -> System.out.println("Invalid shape choice. Please try again.");
        }
    }
    /**
     * removes a shape to a linkedList
     * 
     * @param list the linkedList
     * @param sc scanner for user input
     */
    private static void removeShape(GeometryLinkedList<GeometryBase> list, Scanner sc) {
        System.out.println("Which shape do you want to remove?");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Rectangular Prism\n5. Triangular Prism\n6. Sphere ");
        System.out.print("Enter your choice: ");
        int shapeChoice = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Circle");
        map.put(2, "Rectangle");
        map.put(3, "Triangle");
        map.put(4, "RectangularPrism");
        map.put(5, "TriangularPrism");
        map.put(6, "Sphere");
        

        boolean removed = false;
        for (int i = 0; i < list.size(); i++) {
            GeometryBase shape = list.get(i);
            String shapeType = shape.getClass().getSimpleName();
            if (shapeType.equalsIgnoreCase(map.get(shapeChoice))) {
                System.out.println("Is this the shape you want to remove");
                System.out.println(shapeType);

                String choice = sc.next();
                if(choice.equalsIgnoreCase("n")){
                    continue;
                }
                System.out.println("Removing " + shapeType  + "...");
                list.remove(i);
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("No more shape of type " + map.get(shapeChoice) + " found.");
        }
    }

    /**
     * finds a shape to a linkedList
     * 
     * @param list the linkedList
     * @param sc scanner for user input
     */
    private static void findShape(GeometryLinkedList<GeometryBase> list, Scanner sc) {
        System.out.println("Which shape do you want to find?");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Rectangular Prism\n5. Triangular Prism\n6. Sphere ");
        System.out.print("Enter your choice: ");
        int shapeChoice = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Circle");
        map.put(2, "Rectangle");
        map.put(3, "Triangle");
        map.put(4, "RectangularPrism");
        map.put(5, "TriangularPrism");
        map.put(6, "Sphere");

        for (GeometryBase shape : list) {
            String shapeType = shape.getClass().getSimpleName();
            if (shapeType.equalsIgnoreCase(map.get(shapeChoice))) {
                if (shape instanceof Geometry2D geometry2D) {
                    System.out.printf("2D Shape %s: Area = %.2f, Perimeter = %.2f%n", shapeType, geometry2D.area(), geometry2D.perimeter());
                } else if (shape instanceof Geometry3D geometry3D) {
                    System.out.printf("3D Shape %s: Volume = %.2f, Surface Area = %.2f%n", shapeType, geometry3D.volume(), geometry3D.surfaceArea());
                }
            }
        }
    }
}
