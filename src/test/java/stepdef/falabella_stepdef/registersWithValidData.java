package stepdef.falabella_stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.falabella_models.UserData;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import tasks.falabella_tasks.FillRegistrationForm;
import tasks.falabella_tasks.Register;

import java.util.Map;

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
    public void the_user_registers_with_valid_data(DataTable dataTable) {
        Map<String, String> userData = dataTable.asMap(String.class, String.class);

        UserData user = new UserData(
                userData.get("firstName"),
                userData.get("lastName"),
                userData.get("email"),
                userData.get("idType"),
                userData.get("idNumber"),
                userData.get("confirmId"),
                userData.get("phoneNumber"),
                userData.get("password")
        );

        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.withData(user)
        );
    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String string) {
        // Write code here that turns the phrase above into concrete actions

    }


}
