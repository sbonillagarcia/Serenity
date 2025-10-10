package stepdef.falabella_stepdef.seleccionar_producto;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Login;
import tasks.OpenLoginPage;
import tasks.falabella_tasks.seleccionar_producto.OpenShoppingCarPage;

public class AddToShoppingCar {


    @Given("I am logged in as a registered user,")
    public void iAmLoggedInAsARegisteredUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenLoginPage.url(),
                Login.withCredentials("lapsijerte@necub.com","Passw0rd!")
        );

    }

    @And("I browse through the product catalog,")
    public void iBrowseThroughTheProductCatalog() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenShoppingCarPage.open()
        );
    }

    @When("I select a product and add it to my cart,")
    public void iSelectAProductAndAddItToMyCart() {


    }

    @Then("the product should be added to my cart successfully,")
    public void theProductShouldBeAddedToMyCartSuccessfully() {
    }

    @And("the cart should reflect the correct number of items.")
    public void theCartShouldReflectTheCorrectNumberOfItems() {
    }
}

