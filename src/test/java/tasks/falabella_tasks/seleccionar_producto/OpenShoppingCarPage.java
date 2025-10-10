package tasks.falabella_tasks.seleccionar_producto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.falabella_ui.seleccionar_producto.ShoppingCartPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenShoppingCarPage implements Task {

    private final ShoppingCartPage shoppingCartPage;

    public OpenShoppingCarPage(ShoppingCartPage shoppingCartPage) {
        this.shoppingCartPage = shoppingCartPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(shoppingCartPage)
        );
    }

    public static OpenShoppingCarPage open() {
        return instrumented(OpenShoppingCarPage.class);
    }
}
