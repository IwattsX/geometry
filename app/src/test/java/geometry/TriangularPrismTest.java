package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangularPrismTest {
    @Test 
    void should_create_TriangularPrism(){
        TriangularPrism prism = new TriangularPrism(1, 1, 1, 1, 1);
    }

    @Test
    void should_calculate_surface_area(){
        TriangularPrism prism = new TriangularPrism(1, 1, 1, 1, 1);
        assertEquals(prism.surfaceArea(), 4.0);
    }

    @Test 
    void should_calculate_volume(){
        TriangularPrism prism = new TriangularPrism(1, 1, 1, 1, 1);
        assertEquals(prism.volume(), 0.5);
    }
}
