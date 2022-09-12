package testinstance;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(Lifecycle.PER_CLASS)
public class TestInstanceExample {
    private  String largeContent;

    @BeforeAll
    public void setUpFixture() {
        largeContent = "https://shareprogramming.net/";
    }

    @Test
    public void testContainNet() {
        assertTrue(largeContent.contains("net"));
    }

    @Test
    public void testStartWithHTTP() {
        assertTrue(largeContent.startsWith("http"));
    }

}
