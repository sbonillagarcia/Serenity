package stepdef.falabella_stepdef;

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
import questions.falabella_questions.RegistrationMessage;
import tasks.falabella_tasks.*;


import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class registersWithValidData {


    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        // Inicializamos el "cast" de actores
        OnStage.setTheStage(new OnlineCast());
        // Creamos el actor principal y le damos la habilidad de usar el navegador
        OnStage.theActorCalled("user").can(BrowseTheWeb.with(driver));
    }

    @Given("the user opens the registration page")
    public void the_user_opens_the_registration_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenRegistrationPage.open()
        );
    }

    @When("the user registers with valid data:")
    public void the_user_registers_with_valid_data(io.cucumber.datatable.DataTable dataTable) {

        // Convertimos la DataTable a Map<String, String>
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        String randomEmail = "yifyedofya" + System.currentTimeMillis() + "@necub.com";

        UserData userData = new UserData(
                data.get("firstName"),
                data.get("lastName"),
                data.get("email"),
                //randomEmail, --En caso de uno estático
               // data.get("idType"),
                data.get("idNumber"),
                data.get("confirmId"),
                data.get("phoneNumber"),
                data.get("password"),
                Boolean.parseBoolean(data.get("acceptTOS")),
                Boolean.parseBoolean(data.get("terms"))
        );


        // 🎭 Ejecutamos las Tasks en Screenplay
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterContactInformation.withData(userData),
                EnterPersonalInformation.withData(userData),
                EnterCredentials.withData(userData),
                AcceptTermsAndConditions.withData(userData),
                SubmitRegistration.withData()
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
