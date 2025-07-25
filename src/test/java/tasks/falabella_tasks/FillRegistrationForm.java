package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.falabella_ui.RegistrationPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillRegistrationForm implements Task {

    public static FillRegistrationForm fillForm() {
        return instrumented(FillRegistrationForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(RegistrationPage.class)
        );

    }
}
