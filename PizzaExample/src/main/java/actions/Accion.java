package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Accion {

    public static void goTo(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public static void click(WebDriver driver, By objective) {
        driver.findElement(objective).click();
    }

    public static void moverCursor(WebDriver driver, By objective){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(objective)).perform();
    }

    public static void ingresarTexto(WebDriver driver, By objective, String input) {
        driver.findElement(objective).clear();
        driver.findElement(objective).sendKeys(input);
    }
    public static void clickJs(WebDriver driver, By objetivo) {
        WebElement element = driver.findElement(objetivo);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

}
