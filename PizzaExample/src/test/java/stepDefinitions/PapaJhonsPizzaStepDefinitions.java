package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PapaJhonsIndexPage;
import pages.SelectedPizzaPage;

import java.nio.channels.SelectableChannel;

public class PapaJhonsPizzaStepDefinitions {
    PapaJhonsIndexPage papaJhonsIndexPage;
    SelectedPizzaPage selectedPizzaPage;

    @Given("^I'm in \"([^\"]*)\"$")
    public void iMIn(String url){
       papaJhonsIndexPage.goTo(url);
    }

    @When("^I select a chicken mushroom pizza$")
    public void iSelectAChickenMushroomPizza() {
        papaJhonsIndexPage.moveToTraditionalSeccion();
        papaJhonsIndexPage.clickSelectedPizza();
    }

    @Then("^I select the ingredients and the size$")
    public void iSelectTheIngredientsAndTheSize() {
        selectedPizzaPage.clickSelectedsize();
        selectedPizzaPage.clickModifyIngredients();
        selectedPizzaPage.selectExtraIngredients();
        selectedPizzaPage.clickAddBtn();
        selectedPizzaPage.clickCheckoutBtn();
    }
}
