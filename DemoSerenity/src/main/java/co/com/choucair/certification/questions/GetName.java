package co.com.choucair.certification.questions;

import co.com.choucair.certification.interactions.SearchProduct;
import co.com.choucair.certification.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.userinterfaces.ProductPage.PRODUCT_NAME_TEXT;
import static co.com.choucair.certification.userinterfaces.ProductPage.SEARCH_PRODUCT_NAME_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class GetName implements Question<String> {

    public static Question<String> Product(){
     return new GetName();
 }

    @Override
    public String answeredBy(Actor actor) {

        WaitUntil.the(PRODUCT_NAME_TEXT, isEnabled());
        return Text.of(PRODUCT_NAME_TEXT).viewedBy(actor).asString().trim();
    }
}
