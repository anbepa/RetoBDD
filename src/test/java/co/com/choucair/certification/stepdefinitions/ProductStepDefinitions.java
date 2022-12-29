package co.com.choucair.certification.stepdefinitions;


import co.com.choucair.certification.interactions.Wait;
import co.com.choucair.certification.models.DataProduct;
import co.com.choucair.certification.questions.GetName;
import co.com.choucair.certification.questions.PresenceName;
import co.com.choucair.certification.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static co.com.choucair.certification.utils.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductStepDefinitions {

    @Before
    public void setUp() {


        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());

    }



    @Given("^the user entered the section to enter a new product$")
    public void theUserEnteredTheSectionToEnterANewProduct() {
        OnStage.theActorCalled(ADMINISTRATOR).wasAbleTo(Open.url(ENVIRONMENT));
        theActorInTheSpotlight().attemptsTo(
                LoginTo.pageDemoSerenity(),
                GoTo.products()
        );
    }

    @When("^you fill out the form whit$")
    public void youFillOutTheFormWhit(List<DataProduct> dataProducts) {
        theActorInTheSpotlight().attemptsTo(
                CreateThe.newProduct(dataProducts),
                Wait.aTime(2000),
                SearchProduct.forName()


        );

    }

    @Then("^should show the created product on the screen$")
    public void shouldShowTheCreatedProductOnTheScreen() {
        Wait.aTime(2000);
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(GetName.Product().
                        answeredBy(theActorInTheSpotlight())).
                        isEqualTo(theActorInTheSpotlight().recall("textProductName"))
        );

    }
    @When("^look for the product$")
    public void lookForTheProduct() {
        theActorInTheSpotlight().attemptsTo(
                SearchProduct.forName()
        );
    }

    @When("^delete the product$")
    public void deleteTheProduct() {
        theActorInTheSpotlight().attemptsTo(
                DeleteThe.newProduct()
        );
    }

    @Then("^not should show the created product on the screen$")
    public void notShouldShowTheCreatedProductOnTheScreen() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(PresenceName.Product().
                                answeredBy(theActorInTheSpotlight())).
                        isFalse()
        );
    }


}