import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features")//src/test/resources/features
public class CucumberTest {
}

//http://demo.automationtesting.in/Register.html