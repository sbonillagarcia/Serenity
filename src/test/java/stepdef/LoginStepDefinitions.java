package stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import questions.LoginResult;
import tasks.Login;
import tasks.OpenLoginPage;
import models.Credentials;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepDefinitions {

        @Managed(driver = "chrome")
        WebDriver driver;

        @Before
        public void setUp() {
            OnStage.setTheStage(new OnlineCast());
            OnStage.theActorCalled("User").can(BrowseTheWeb.with(driver));
        }

        @Given("the user opens the login page")
        public void theUserOpensTheLoginPage() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    OpenLoginPage.url()
            );
        }

        @When("they enter valid credentials")
        public void theyEnterValidCredentials(DataTable table) {
        Map<String, String> data = table.asMap();
        Credentials credentials = new Credentials(data.get("username"), data.get("password"));

            OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(credentials)
            );
        }

    @Then("they should be redirected to the dashboard")
        public void theyShouldBeRedirectedToTheDashboard() {
            OnStage.theActorInTheSpotlight().should(
                    seeThat(LoginResult.message(), equalTo("Welcome!"))
            );
        }
    }

