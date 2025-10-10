package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.falabella_ui.RegistrationPageObject;

public class SubmitOtpCreate implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegistrationPageObject.SUBMIT_OTP)
        );
    }

    public static SubmitOtpCreate code() {
        return new SubmitOtpCreate();
    }
}
