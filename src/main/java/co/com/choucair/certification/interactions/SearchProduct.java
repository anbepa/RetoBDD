package co.com.choucair.certification.interactions;

import co.com.choucair.certification.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.userinterfaces.LoginPage.BUTTON_SIGN_IN;
import static co.com.choucair.certification.userinterfaces.ProductPage.SEARCH_PRODUCT_NAME_FIELD;
import static co.com.choucair.certification.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchProduct implements Interaction {
    public static SearchProduct forName() {
        return instrumented(SearchProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(PRODUCT_NAME).into(SEARCH_PRODUCT_NAME_FIELD)
        );
    }
}
