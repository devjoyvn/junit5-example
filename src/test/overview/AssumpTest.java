package overview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
public class AssumpTest {

    // Assume testing
    @Test
    public void assumpTrue() {
        int x = 5, y = 4;
        assumeTrue(x < y);
        assertTrue(x - y < 0);
    }

    @Test
    public void assumpFalse() {
        int x = 5, y = 4;
        assumeFalse(x < y);
        assertTrue(x - y < 0);
    }

    @Test
    void assumptionThat() {
        String someString = "Just a string";
        assumingThat(
                someString.equals("Just a string"),
                () -> assertEquals(2 + 2, 4)
        );
    }

}
