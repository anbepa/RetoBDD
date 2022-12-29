package co.com.choucair.certification.tasks;


import co.com.choucair.certification.interactions.Wait;
import co.com.choucair.certification.models.DataProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.userinterfaces.ProductPage.*;
import static co.com.choucair.certification.utils.Constants.PRODUCT_NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProduct implements Task {


    public static SearchProduct forName() {

        return instrumented(SearchProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Wait.aTime(2000),
                Enter.theValue(PRODUCT_NAME).into(SEARCH_PRODUCT_NAME_FIELD),
                WaitUntil.the(PRODUCT_NAME_TEXT, isVisible())

        );


    }
}
