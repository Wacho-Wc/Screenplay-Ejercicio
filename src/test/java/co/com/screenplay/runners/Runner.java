package co.com.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/phptravels.feature",
        glue = "co/com/screenplay/stepdefinations",
        snippets = SnippetType.CAMELCASE
)
public class Runner {
}
