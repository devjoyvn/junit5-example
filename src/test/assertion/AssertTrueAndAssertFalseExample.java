package assertion;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTrueAndAssertFalseExample {
    @Test
    public void assertTrueAndAssertFalseExample() {

        assertTrue(true); // passed

        assertFalse(false); // passed

        assertTrue(5 > 4, "5 is greater the 4"); // passed

        assertTrue(null == null, "null is equal to null"); // passed

        assertFalse(4 > 5, "5 is greater the 4"); // passed


    }

    @Test
    public void assertTrueAndAssertFalseLambdaExample() {
        BooleanSupplier conditionTrue = () -> 5 > 4;

        BooleanSupplier conditionFalse = () -> 5 < 4;


        assertTrue(conditionTrue, "5 is greater the 4"); // passed

        assertFalse(conditionFalse, "5 is greater the 4"); // passed

    }
}
