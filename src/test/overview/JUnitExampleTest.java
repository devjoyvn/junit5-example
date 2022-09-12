package overview;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnitExampzleTest")
public class JUnitExampleTest {

    @BeforeAll
    static void setup() {
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
    }


    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    @DisplayName("My test method")
    public void test() {
        System.out.println("Test");
    }

    @Test
    @Disabled
    public void disable() {
        System.out.println("disable");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

}
