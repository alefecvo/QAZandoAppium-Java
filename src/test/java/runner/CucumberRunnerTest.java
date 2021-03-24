package runner;

import capabilities.DriverFactoryManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"StepsDefinitions"},
        tags = {"@Login"}
)

public class CucumberRunnerTest {

    @BeforeClass
    public static void tearUp() {
//        DriverFactoryManager.appiumServerUp();
//        DriverFactoryManager.startDriverByMavenParameter(System.getProperty("environment"));
        DriverFactoryManager.startDriverByMavenParameter("IPHONE");
    }

    @AfterClass
    public static void tearDown() {
//        DriverFactoryManager.appiumServerDown();
        DriverFactoryManager.quitDriver();
    }

}