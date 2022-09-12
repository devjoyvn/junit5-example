package assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertNullAndNotNullExample {

    @Test
    public void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();

        assertNotNull(dog, () -> "The dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;
        assertNull(cat, () -> "The cat should be null");
    }
}
