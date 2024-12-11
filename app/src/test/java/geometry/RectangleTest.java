package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
	void should_create_rectangle() {
		Rectangle rectangle = new Rectangle(1, 1);
	}
	
	@Test
	void should_calculate_area() {
		Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.area(), 1.0);
	}
	
	@Test
	void should_calculate_perimeter() {
		Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(rectangle.perimeter(), 4.0);
	}
}
