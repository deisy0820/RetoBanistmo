package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.*;
import userinterfaces.HomeBanistmo;

public class storeStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor user = Actor.named("usuario");
    private HomeBanistmo homeBanistmo;

    @Given("^that user enter to page$")
    public void that_user_enter_to_page() throws Exception {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(OpenTheBrowser.at(homeBanistmo));
    }

    @When("^He click fees deposit rates$")
    public void he_click_fees_deposit_rates() throws Exception {
        user.attemptsTo(EnterTariff.is());

    }

    @Then("^He validate PDF$")
    public void he_validate_PDF() throws Exception {

    }

}
