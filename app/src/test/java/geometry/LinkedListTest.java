package geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test 
    void test_create_list(){
        GeometryLinkedList<GeometryBase> list = new GeometryLinkedList<GeometryBase>();

        list.add(new Sphere(4.0));
        list.add(new Rectangle(2, 4));

        assertEquals(list.size(), 2);

        list.remove(0);

        assertEquals(list.size(), 1);

    }
}
