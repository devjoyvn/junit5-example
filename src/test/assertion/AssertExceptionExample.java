package assertion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 *
 * @author hga
 */
public class AssertExceptionExample {
@Test
void assertExceptionExample() {
    Throwable exception = assertThrows(
            IllegalArgumentException.class,
            () -> {
                throw new IllegalArgumentException("Exception message");
            }
    );
    assertEquals("Exception message", exception.getMessage());
}
}
