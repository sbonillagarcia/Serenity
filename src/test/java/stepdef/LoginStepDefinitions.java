package stepdef;

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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

git
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
            // Aquí puedes abrir directamente la URL si aún no usas una tarea "OpenPage"
            driver.get("https://releaseqa3.arandasoft.com/adm/Pages/app/login");
        }

        @When("they enter valid credentials")
        public void theyEnterValidcredentials() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    Login.withCredentials("admin", "admin123")
            );
        }

        @Then("they should be redirected to the dashboard")
        public void theyShouldBeRedirectedToTheDashboard() {
            OnStage.theActorInTheSpotlight().should(
                    seeThat(LoginResult.message(), equalTo("Welcome!"))
            );
        }
    }

