package pages;

import actions.Accion;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import utils.Util;

public class SelectedPizzaPage extends PageObject {
    By megaSizeOption = By.xpath("//a[contains(@title,'MegaFamiliar')]");
    By modifyIngredientsBtn = By.xpath("//a[contains(text(),'Modificar ingredientes')]");
    By OnionAddBox = By.id("adicion_1662");
    By jalapenosAddBox = By.id("adicion_1687");
    By italiansausageAddBox = By.id("adicion_1682");
    By addBtn = By.xpath("//a[contains(@class,'btn redbtn')]");
    By checkoutBtn = By.xpath("//input[contains(@title,'Añadir')]");

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
