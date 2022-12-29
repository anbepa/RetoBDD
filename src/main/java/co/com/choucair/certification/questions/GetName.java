package co.com.choucair.certification.questions;

import co.com.choucair.certification.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.userinterfaces.ProductPage.PRODUCT_NAME_TEXT;


public class GetName implements Question<String> {

    public static Question<String> Product(){
     return new GetName();
 }

    @Override
    public String answeredBy(Actor actor) {

        Wait.aTime(2000);
        return Text.of(PRODUCT_NAME_TEXT).viewedBy(actor).asString().trim();
    }
}
