package tagandfilter;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("tagclass")
public class TagExample {

    @Test
    @Tag("tagmethod")
    public void tagTest() {
        fail();
        System.out.println("tagTest");
    }

    @Test
    public void normalTest() {
        fail();
        System.out.println("haha");
    }
}
