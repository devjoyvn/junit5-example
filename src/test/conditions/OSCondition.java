package conditions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OSCondition {

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    public void testRunOnWindowsAndMacOS() {
        // more code
    }

@Test
@DisabledOnOs({OS.LINUX})
public void disabledOnLinux() {
    // more code
}
}
