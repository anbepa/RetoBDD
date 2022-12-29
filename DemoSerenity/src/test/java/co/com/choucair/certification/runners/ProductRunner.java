package co.com.choucair.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.choucair.certification.stepdefinitions"},
        features = "src/test/resources/features/create_product.feature",
        snippets = SnippetType.CAMELCASE
)
public class ProductRunner {
}
