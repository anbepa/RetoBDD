package co.com.choucair.certification.tasks;



import co.com.choucair.certification.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.choucair.certification.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DeleteThe implements Task {




    public static DeleteThe newProduct() {

        return instrumented(DeleteThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(PRODUCT_NAME, isVisible()),
                Click.on(PRODUCT_NAME),
                JavaScriptClick.on(DELETE_NEW_PRODUCT_BUTTON),
                Click.on(DELETE_NEW_PRODUCT_CONFIRMING_BUTTON),
                Wait.aTime(1000)


        );


    }
}
