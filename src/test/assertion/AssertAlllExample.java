package assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *
 * @author hga
 */
public class AssertAlllExample {
    @Test
    public void assertAllExample() {
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> {
                    Integer value = 10;
                    assertNotNull(value);
                },
                () -> {
                    assertTrue(5 > 4, "5 must be greater 4");
                    assertFalse(4 > 5, "5 must be greater 4");
                },
                () -> {
                    String origin = "str";
                    String s1 = origin;
                    String s2 = origin;
                    String s3 = "tmp";
                    assertSame(s1, s2);
                    assertNotSame(s1, s3);
                }
        );
    }
}
