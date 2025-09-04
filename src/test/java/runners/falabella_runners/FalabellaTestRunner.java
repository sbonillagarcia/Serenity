package runners.falabella_runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/falabella_features",
        glue = "stepdef.falabella_stepdef",
        tags = "@ValidRegistration",
        plugin = {"pretty"}
)
public class FalabellaTestRunner {}
