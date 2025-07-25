package stepdef.falabella_stepdef;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import tasks.falabella_tasks.FillRegistrationForm;

public class registersWithValidData {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").can(BrowseTheWeb.with(driver));
    }

    @Given("the user opens the registration page")
    public void the_user_opens_the_registration_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillRegistrationForm.fillForm()
        );
    }

    @When("the user registers with valid data:")
    public void the_user_registers_with_valid_data(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions


    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions

    }


}
