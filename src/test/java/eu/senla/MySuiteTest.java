package eu.senla;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({LoginTest.class,AddAndDeleteElementTest.class,PresenceElementTest.class})
public class MySuiteTest {
}
