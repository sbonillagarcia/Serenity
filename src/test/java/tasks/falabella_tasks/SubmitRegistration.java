package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SubmitRegistration implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(RegistrationPageObject.SUBMIT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegistrationPageObject.SUBMIT)
        );


    }

    public static SubmitRegistration withData(){
        return instrumented(SubmitRegistration.class);
    }
}
