package assertion;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;

/**
 *
 * @author hga
 */
public class assertTimeoutExample {
@Test
public void whenAssertingTimeout_thenNotExceeded() {
    assertTimeout(
            ofSeconds(2),
            () -> {
                // code that requires less then 2 minutes to execute
                Thread.sleep(1000);
            });

}
}
