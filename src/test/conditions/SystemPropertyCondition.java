package conditions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import java.util.Properties;

public class SystemPropertyCondition {


    @Test
    void printSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((k, v) -> System.out.println(k + ":" + v));
    }


    // Full name
    @Test
    @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    public void testEnabledWithFullName() {
        // more code
    }

    // Su dung regex

    @Test
    @EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
    public void testEnabledWithRegex() {
        // more code
    }


    // Full name
    @Test
    @DisabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle Corporation")
    public void testDisabledWithFullName() {
        // more code
    }

    // Su dung regex

    @Test
    @DisabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*")
    public void testDisablededWithRegex() {
        // more code
    }

    @Test
    @EnabledIfSystemProperties(value = {@EnabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*"),
            @EnabledIfSystemProperty(named = "ava.vm.name", matches = ".*OpenJDK.*")})
    public void testEnabledIfSystemProperties() {
    }


    @Test
    @DisabledIfSystemProperties(value = {@DisabledIfSystemProperty(named = "java.vm.vendor", matches = "Oracle.*"),
            @DisabledIfSystemProperty(named = "ava.vm.name", matches = ".*OpenJDK.*")})
    public void testDisabledIfSystemProperties() {
    }

}
