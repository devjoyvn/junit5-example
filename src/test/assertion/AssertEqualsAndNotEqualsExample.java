package assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class AssertEqualsAndNotEqualsExample {
    @Test
    public void assertEqualsExample() {
        class test {
            int value;
            test(){}
            test(int value) {
                this.value = value;
            }

            @Override
            public boolean equals(Object obj) {
                return this.value == ((test) obj).value;
            }
        }

        assertEquals(BigDecimal.valueOf(10), BigDecimal.valueOf(10));
        assertNotEquals(BigDecimal.valueOf(11), BigDecimal.valueOf(10));

        assertEquals(new test(10), new test(10)); // passed
        assertNotEquals(new test(10), new test( 11)); //  passed

    }

}
