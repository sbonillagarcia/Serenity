package stepdef.falabella_stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.falabella_models.UserData;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import questions.falabella_questions.RegistrationMessage;
import questions.falabella_questions.RegistrationUrl;
import tasks.falabella_tasks.FillRegistrationForm;
import tasks.falabella_tasks.Register;
import userinterface.falabella_ui.RegistrationPageObject;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;

public class registersWithValidData {

    @Managed(driver = "chrome")
    WebDriver driver;

    Actor user = Actor.named("User");

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
        var data = dataTable.asMap(String.class, String.class);

        user.attemptsTo(
                Enter.theValue(data.get("firstName")).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(data.get("lastName")).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(data.get("email")).into(RegistrationPageObject.EMAIL),

                // Selección del tipo de documento
                Click.on(RegistrationPageObject.ID_TYPE_DROPDOWN),
                data.get("idType").equalsIgnoreCase("CC")
                        ? Click.on(RegistrationPageObject.CC_OPTION)
                        : Click.on(RegistrationPageObject.CE_OPTION),

                Enter.theValue(data.get("idNumber")).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(data.get("confirmId")).into(RegistrationPageObject.CONFIRM_ID),
                Enter.theValue(data.get("phoneN")).into(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(data.get("password")).into(RegistrationPageObject.PASSWORD),

                // Aceptar términos
                Click.on(RegistrationPageObject.ACCEPT_TOS),
                Click.on(RegistrationPageObject.TERMS),

                // Click en "Crear cuenta"
                Click.on(RegistrationPageObject.SUBMIT)
        );
    }

    @Then("the user should see the message {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El mensaje mostrado",
                        RegistrationMessage.text(),
                        containsString(expectedMessage)
                )
        );

    }
}
