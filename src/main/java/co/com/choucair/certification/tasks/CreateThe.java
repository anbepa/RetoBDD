package co.com.choucair.certification.tasks;



import co.com.choucair.certification.models.DataProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import static co.com.choucair.certification.userinterfaces.ProductPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CreateThe implements Task {


    private List<DataProduct> dataProducts;

    public CreateThe(List<DataProduct> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public static CreateThe newProduct(List<DataProduct> dataProducts) {

        return instrumented(CreateThe.class, dataProducts);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(NEW_PRODUCT_BUTTON),
                Enter.theValue(dataProducts.get(0).getProductName()).into(PRODUCT_NAME_FIELD),
                Enter.theValue(dataProducts.get(0).getUnitsInStock()).into(UNITS_STOCK_FIELD),
                Enter.theValue(dataProducts.get(0).getUnitsOnOrder()).into(UNITS_ORDER_FIELD),
                Enter.theValue(dataProducts.get(0).getReorderLevel()).into(REORDER_LEVEL_FIELD),
                WaitUntil.the(SAVE_NEW_PRODUCT_BUTTON, isEnabled()),
                JavaScriptClick.on(SAVE_NEW_PRODUCT_BUTTON)

        );
        actor.remember("textProductName",dataProducts.get(0).getProductName());

    }
}
