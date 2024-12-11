package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
        @Test
	void should_create_Triangle() {
		Triangle Triangle = new Triangle(1, 1, 1, 1);
	}
	
	@Test
	void should_calculate_area() {
		Triangle Triangle = new Triangle(1, 1, 1, 1);
        assertEquals(Triangle.area(), 0.5);
	}
	
	@Test
	void should_calculate_perimeter() {
		Triangle Triangle = new Triangle(1, 1, 1, 1);
        assertEquals(Triangle.perimeter(), 3.0);
	}
}
