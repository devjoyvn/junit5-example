package displayname;


import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DisplayNameGeneratorExample {

    @Test
    void test_spaces_ok() {
    }

    @Test
    void test_spaces_fail() {
    }

}