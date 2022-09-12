package displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("DisplayName example")
public class DisplayNameExample {

    @Test
    @DisplayName("Test String blank")
    public void testStringBlank() {
        String input = "test";
        assertTrue(input != null && input != "");
    }
}
