package mockandspy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SpyExample {

    @Spy
    private List<String> spyList = new ArrayList();


    @Test
    public void testSpyList() {
        spyList.add("test");
        assertEquals("test", spyList.get(0));
    }

    @Test
    public void testSpyWithStub() {
        String expected = "Spy 100";
        Mockito.doReturn(expected).when(spyList).get(100);

        assertEquals(expected, spyList.get(100));
    }
}
