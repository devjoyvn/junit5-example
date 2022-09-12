package overview;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTest {
    @Test
    void assertTrueEx() {
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5");
    }

    @Test
    void assertEqualsEx() {
        assertEquals(7, 5 + 2);
    }

    @Test
    void assertAllEx() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertTrue(numbers[3] == 3, "should be 3"),
                () -> assertEquals(numbers[4], 1)
        );
    }


}
