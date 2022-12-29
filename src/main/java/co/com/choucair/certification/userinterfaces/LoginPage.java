package co.com.choucair.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("field to enter the username").
            located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD = Target.the("field to enter the password").
            located(By.id("LoginPanel0_Password"));
    public static final Target BUTTON_SIGN_IN = Target.the("button to start session").
            located(By.id("LoginPanel0_LoginButton"));

    private LoginPage(){}
}
