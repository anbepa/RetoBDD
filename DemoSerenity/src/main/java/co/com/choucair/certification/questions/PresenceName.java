package co.com.choucair.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Presence;


import static co.com.choucair.certification.userinterfaces.ProductPage.PRODUCT_NAME_NOT_TEXT;


public class PresenceName implements Question<Boolean> {

    public static Question<Boolean> Product(){
     return new PresenceName();
 }

    @Override
    public Boolean answeredBy(Actor actor) {


        return Presence.of(PRODUCT_NAME_NOT_TEXT).viewedBy(actor).asBoolean();
    }
}
