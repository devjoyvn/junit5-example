package repeated;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTestExample {
    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    void repeatedTest() {
        System.out.println("Executing repeated test");

        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }


    @RepeatedTest(value = 3, name = "custom name")
    void customNameTest() {
        System.out.println("Executing repeated test");

        assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before Each Test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("After Each Test");
        System.out.println("=====================");
    }

    @RepeatedTest(3)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());

        assertEquals(3, repetitionInfo.getTotalRepetitions());
    }

}
