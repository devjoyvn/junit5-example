package order;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationExample {
    private static StringBuilder output = new StringBuilder("");

    @Test
    @Order(1)
    public void firstTest() {
        output.append("a");
    }

    @Test
    @Order(2)
    public void secondTest() {
        output.append("b");
    }

    @Test
    @Order(3)
    public void thirdTest() {
        output.append("c");
    }

    @AfterAll
    public static void assertOutput() {
        assertEquals(output.toString(), "abc");
    }
}
