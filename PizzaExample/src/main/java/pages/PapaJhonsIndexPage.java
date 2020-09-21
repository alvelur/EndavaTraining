package pages;

import actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PapaJhonsIndexPage extends PageObject {

    By traditionalSeccion = By.xpath("//nav[@id='main-menu']//a[contains(text(),'Tradicionales')]");
    By chickenPizzaOption = By.xpath("//li[1]//div[1]//ul[1]//li[3]//a[1]");

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
