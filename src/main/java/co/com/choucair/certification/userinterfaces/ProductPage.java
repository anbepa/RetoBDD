package co.com.choucair.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    public static final Target NEW_PRODUCT_BUTTON = Target.the("button to make a new order").
            located(By.className("add-button"));
    public static final Target PRODUCT_NAME_FIELD = Target.the("field to enter the customer").
            located(By.name("ProductName"));
    public static final Target UNITS_STOCK_FIELD = Target.the("field to search for the customer").
            located(By.name("UnitsInStock"));
    public static final Target UNITS_ORDER_FIELD = Target.the("customer selection").
            located(By.name("UnitsOnOrder"));
    public static final Target REORDER_LEVEL_FIELD = Target.the("Date of the order").
            located(By.name("ReorderLevel"));

    public static final Target SAVE_NEW_PRODUCT_BUTTON = Target.the("save product").
            located(By.cssSelector("div[class='tool-button save-and-close-button icon-tool-button']"));

    public static final Target DELETE_NEW_PRODUCT_BUTTON = Target.the("delete new product").
            located(By.cssSelector("div[class='tool-button delete-button icon-tool-button']"));

    public static final Target DELETE_NEW_PRODUCT_CONFIRMING_BUTTON = Target.the("delete new product button").
            located(By.cssSelector("button[class='btn btn-primary']"));

    public static final Target SEARCH_PRODUCT_NAME_FIELD = Target.the("search product").
            located(By.cssSelector("input[class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));
    public static final Target PRODUCT_NAME_TEXT = Target.the("product name text").
            located(By.xpath("(//a[@class='s-EditLink s-Demo-Northwind-ProductLink'])[2]"));

    public static final Target PRODUCT_NAME_NOT_TEXT = Target.the("product name not").
            located(By.xpath("//div[@class='grid-canvas']/div"));

    public static final Target PRODUCT_NAME = Target.the("product name").
            located(By.xpath("//a[starts-with(@href,'#Demo-Northwind-Product')]"));

private ProductPage() {}

}
