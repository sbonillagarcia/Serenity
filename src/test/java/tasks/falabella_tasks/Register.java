package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import java.util.Map;

public class Register implements Task {

    private final UserData user;

    public Register(UserData user) {
        this.user = user;
    }

    public static Register withData(UserData user) {
        return new Register(user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.EMAIL),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.ID_TYPE),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.CONFIRM_ID),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.PASSWORD),
                Click.on(RegistrationPageObject.VIEWER),
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.ACCEPT_TOS),
                Click.on(RegistrationPageObject.TERMS),
                Click.on(RegistrationPageObject.SUBMIT)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
