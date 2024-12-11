package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SphereTest {
    @Test 
    void should_create_Sphere(){
        Sphere sphere = new Sphere(3);
    }

    @Test
    void should_calculate_surface_area(){
        Sphere sphere = new Sphere(3);
        assertEquals(sphere.surfaceArea(), 36 * Math.PI);

    }

    @Test 
    void should_calculate_volume(){
        Sphere sphere = new Sphere(1);

        assertEquals(sphere.volume(), 4.0/3.0 * Math.PI );

    }
}
