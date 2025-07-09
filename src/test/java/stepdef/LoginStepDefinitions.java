package stepdef;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginResult;
import tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
public class LoginStepDefinitions {

    @Before
    public void  setUp(){OnStage.setTheStage(new OnlineCast()); }

    @Given("the user opens the login page")
        public void theUserOpensTheLoginPage(){
        OnStage.theActorCalled("User").wasAbleTo();

    }

    @When("they enter valid credentials")
        public void theyEnterValidcredentials(){
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials("admin", "admin123"));
    }

    @Then("they should be redirected to the dashboard")
    public void theyShouldBeRedirectedToTheDashboard() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginResult.message(), equalTo("Welcome!"))
        );
    }

}
