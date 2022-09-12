package disable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("It Will be open later")
public class DisableTestClass {

    @ParameterizedTest
    @ValueSource(strings = {"test 1", "test 2"})
    public void testStringIsNotBlank(String input) {
        assertTrue(input != "" && input != null);
    }


    @RepeatedTest(3)
    public void test2plus1() {
        assertTrue(3 ==2 + 1);
    }

}
