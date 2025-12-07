package co.sqasa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.sqasa.StepDef",          // 👈 MUY IMPORTANTE
        plugin = {"pretty", "summary"}
)
public class RunCucumberTest {
}





