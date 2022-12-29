package co.com.choucair.certification.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;





public class HomePage{
    public static final Target MORE_INFO_PRODUCT = Target.the("more information about orders").
            locatedBy("//p[contains(text(),'Product Types')]//parent::div//following-sibling::a");

    private HomePage() {
    }
}
