package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SupportNumber {
    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
}
public class TestExample {
    @Test
    void assertTrue() {
        boolean result = SupportNumber.isNumberEven(8);

        Assertions.assertTrue(result);
    }

    @Test
    void assertFalse() {
        boolean result = SupportNumber.isNumberEven(3);

        Assertions.assertFalse(result);
    }

}
