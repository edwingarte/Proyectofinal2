package capacitacion2.SophosEmpleo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@SophosEmpleo", monochrome = true,
plugin = "pretty", features = "src/test/resources/Features",
glue = "capacitacion2.StepsSophosEmpleo")
public class RunnerSophosEmpleo {

}
