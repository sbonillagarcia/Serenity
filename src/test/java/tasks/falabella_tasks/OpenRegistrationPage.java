package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.falabella_ui.RegistrationPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenRegistrationPage implements Task {

    private final RegistrationPage registrationPage;

    public OpenRegistrationPage() {
        this.registrationPage = new RegistrationPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(registrationPage)
        );
    }

    public static OpenRegistrationPage open() {
        return instrumented(OpenRegistrationPage.class);
    }
}

