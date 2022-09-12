package parameterizedTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

class Numbers {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}

public class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void isOddTest(int number) {
        assertTrue(Numbers.isOdd(number));
    }

    @ParameterizedTest
    @NullSource
    void isNullTest(String input) {
        assertNull(input);
    }

    @ParameterizedTest
    @EmptySource
    void isEmptyTest(String input) {
        assertEquals(input, "");
    }

    @ParameterizedTest
    @EmptySource
    void isEmptyTest(Integer[] input) {
        assertEquals(0, input.length);
    }

    @ParameterizedTest
    @EmptySource
    void isEmptyTest(List<String> input) {
        assertEquals(0, input.size());
    }

    @ParameterizedTest
    @EmptySource
    void isEmptyTest(Map<String, Integer> input) {
        assertEquals(0, input.size());
    }


    @ParameterizedTest
    @NullAndEmptySource
    void isBlankTest(String input) {
        assertTrue(input == null || input == "");
    }


}
