package assertion;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class FailExample {
    @Test
    public void failExample() {
        fail("FAIL - try to development");
    }
}
