package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.*;
import userinterfaces.CrmHome;

public class storeStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor user = Actor.named("usuario");
    private CrmHome crmHome;

    @Given("^that user enter to page$")
    public void that_user_enter_to_page() throws Exception {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(OpenTheBrowser.at(crmHome));
    }

    @When("^He enter new address a ti the account$")
    public void he_enter_new_address_a_ti_the_account() throws Exception {
        user.attemptsTo(EnterPackage.is());
        user.attemptsTo(EnterFlyAccomodation.is());
        user.attemptsTo(EnterStarFour.is());

    }

    @Then("^He validate that the address was added$")
    public void he_validate_that_the_address_was_added() throws Exception {

    }

}
