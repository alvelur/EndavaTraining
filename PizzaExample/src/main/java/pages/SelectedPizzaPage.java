package pages;

import actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.Util;

public class SelectedPizzaPage extends PageObject {
    By megaSizeOption = By.xpath("//div//div//div//div//div//div//div[4]//a[1]");
    By modifyIngredientsBtn = By.xpath("//a[contains(text(),'Modificar ingredientes')]");
    By OnionAddBox = By.id("adicion_1662");
    By jalapenosAddBox = By.id("adicion_1687");
    By italiansausageAddBox = By.id("adicion_1682");
    By addBtn = By.xpath("//html//body//div//div//div//div//div//div//div//div//div//a[contains(text(),'Agregar')]");
    By checkoutBtn = By.xpath("//div[6]//div[1]//input[1]");

    public void clickSelectedsize() {
        Accion.click(getDriver(), megaSizeOption);
    }
    public void clickModifyIngredients() {
        Accion.click(getDriver(), modifyIngredientsBtn);
    }
    public void selectExtraIngredients(){
        Accion.click(getDriver(), OnionAddBox);
        Accion.click(getDriver(), italiansausageAddBox);
        Accion.click(getDriver(), jalapenosAddBox);
        Util.esperarMiliS(2000);

    }
    public void clickAddBtn(){
        Accion.clickJs(getDriver(),addBtn);
    }
    public void clickCheckoutBtn(){
        Accion.clickJs(getDriver(),checkoutBtn);
    }


}
