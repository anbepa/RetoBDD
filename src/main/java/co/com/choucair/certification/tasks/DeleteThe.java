package co.com.choucair.certification.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;




import static co.com.choucair.certification.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteThe implements Task {




    public static DeleteThe newProduct() {

        return instrumented(DeleteThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(PRODUCT_NAME),
                JavaScriptClick.on(DELETE_NEW_PRODUCT_BUTTON),
                Click.on(DELETE_NEW_PRODUCT_CONFIRMING_BUTTON)


        );


    }
}
