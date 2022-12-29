package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.userinterfaces.LoginPage.*;
import static co.com.choucair.certification.utils.Constants.PASSWORD;
import static co.com.choucair.certification.utils.Constants.USERNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTo implements Task {
    public static LoginTo pageDemoSerenity() {
        return instrumented(LoginTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USERNAME).into(LoginPage.USERNAME),
                    Enter.theValue(PASSWORD).into(LoginPage.PASSWORD),
                Click.on(BUTTON_SIGN_IN)
        );
    }
}
