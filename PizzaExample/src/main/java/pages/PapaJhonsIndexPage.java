package pages;

import actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PapaJhonsIndexPage extends PageObject {

    By traditionalSeccion = By.xpath("//a[contains(@data-id,'5613')]");
    By chickenPizzaOption = By.xpath("//a[contains(@title,'POLLO Y CHAMPI')]");

    public void moveToTraditionalSeccion() {
        Accion.moverCursor(getDriver(), traditionalSeccion);
    }
    public void clickSelectedPizza() {
        Accion.click(getDriver(), chickenPizzaOption);
    }
    public void goTo(String url){
        Accion.goTo(getDriver(),url);
    }

}
