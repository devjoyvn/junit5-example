package lifecylcle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hga
 */
public class LifeCylcleExample {

    private List<String> list = new ArrayList<>();

    @BeforeEach
    void init() {
        System.out.println("Init");
        list.add("test 1");
        list.add("test 2");
    }

    @BeforeAll
    static void setUp() {
        System.out.println("setUp");
        System.out.println("connect to database");
    }

    @Test
    public void testMethod() {
        System.out.println("Test");
        list.add("test method");
        assertEquals(3, list.size());
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
        list.clear();
    }

    @AfterAll
    static void tearDown() {
        System.out.println("After each");
        System.out.println("Close connect to database");
    }
}
