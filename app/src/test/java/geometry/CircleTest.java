package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
	void should_create_Circle() {
		Circle Circle = new Circle(1);
	}
	
	@Test
	void should_calculate_area() {
		Circle Circle = new Circle(1);
        assertEquals(Circle.area(), Math.PI);
	}
	
	@Test
	void should_calculate_perimeter() {
		Circle Circle = new Circle(1);
        assertEquals(Circle.perimeter(), 2 * Math.PI);
	}
}
