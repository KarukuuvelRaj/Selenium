package runnerfile;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/featurefiles",glue = "steps", monochrome=true)
public class RunnerClass extends AbstractTestNGCucumberTests{
}
