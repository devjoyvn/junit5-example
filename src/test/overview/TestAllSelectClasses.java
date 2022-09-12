package overview;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 *
 * @author hga
 */
@RunWith(JUnitPlatform.class)
@SelectClasses({AssertTest.class, AssumpTest.class, ExceptionTest.class})
public class TestAllSelectClasses {}