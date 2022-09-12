package assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *
 * @author hga
 */
public class assertThrowsAndDoesNotThrows {
    @Test
    public void assertThrowsExample() {
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void assertDoesNotThrowsExample() {
        assertDoesNotThrow(() -> {
            int a = 3 + 10;
            System.out.println(a);
        }, "No exception is throws");
    }
}
