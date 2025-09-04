package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCredentials implements Task {
    private final UserData userData;

    public EnterCredentials(UserData userData) { this.userData = userData; }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userData.getPassword()).into(RegistrationPageObject.PASSWORD)
        );
    }

    public static EnterCredentials withData(UserData userData) {
        return instrumented(EnterCredentials.class, userData);
    }
}
