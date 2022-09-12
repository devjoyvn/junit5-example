package parameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.EnumSet;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author hga
 */
public class EnumExample {

    @ParameterizedTest
    @EnumSource(Month.class)
    void enumExample(Month month) {
        int monthNumber = month.getValue();
        assertTrue(monthNumber >= 1 && monthNumber <= 12);
    }


    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(30, month.length(isALeapYear));
    }

    @ParameterizedTest
    @EnumSource(
            value = Month.class,
            names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER", "FEBRUARY"},
            mode = EnumSource.Mode.EXCLUDE)
    void exceptFourMonths_OthersAre31DaysLong(Month month) {
        final boolean isALeapYear = false;
        assertEquals(31, month.length(isALeapYear));
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = ".*BER", mode = EnumSource.Mode.MATCH_ANY)
    void fourMonths_AreEndingWithBer(Month month) {
        EnumSet<Month> months =
                EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
        assertTrue(months.contains(month));
    }


    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @MethodSource("sumProvider")
    void testParameterizedTest(int a, int b, int sum, String message) {
        assertEquals(sum, a + b);
        assertTrue(message != null && message != "");
    }

//private static Stream<Arguments> sumProvider() {
//    return Stream.of(
//            Arguments.of(1, 1, 2, "message 1"),
//            Arguments.of(2, 3, 5, , "message 2")
//    );
//}

    private static Object[][] sumProvider() {
        return new Object[][]{{1, 1, 2, "message 1"}, {2, 3, 5, "message 2"}};
    }


}
