package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "src\\test\\java\\stepDefinitions" }, features = {
        "src\\main\\resources\\features\\orderPizza.feature"
},

        snippets = SnippetType.CAMELCASE)

public class PizzaRunner {
}
