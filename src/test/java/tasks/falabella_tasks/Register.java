package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.falabella_ui.RegistrationPageObject;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    private final UserData user;

    public Register(UserData user) {
        this.user = user;
    }

    public static Register withData(UserData user) {
        return instrumented(Register.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getFirstName()).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(user.getEmail()).into(RegistrationPageObject.EMAIL),

                Click.on(RegistrationPageObject.ID_TYPE_DROPDOWN),

                // espera a que las opciones aparezcan y selecciona según idType
                WaitUntil.the(RegistrationPageObject.CC_OPTION, isVisible()).forNoMoreThan(5).seconds()
        );

        if ("CC".equalsIgnoreCase(user.getIdType())) {
            actor.attemptsTo(Click.on(RegistrationPageObject.CC_OPTION));
        } else if ("CE".equalsIgnoreCase(user.getIdType())) {
            actor.attemptsTo(Click.on(RegistrationPageObject.CE_OPTION));
        } else {
            // opcional: lanza excepción o intenta por texto
            actor.attemptsTo(Click.on(RegistrationPageObject.CC_OPTION));
        }

        actor.attemptsTo(
                Enter.theValue(user.getIdNumber()).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(user.getConfirmId()).into(RegistrationPageObject.CONFIRM_ID),
                Enter.theValue(user.getPhoneNumber()).into(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(user.getPassword()).into(RegistrationPageObject.PASSWORD),
                Click.on(RegistrationPageObject.VIEWER)
        );

        // aceptar términos solo si viene "true"
        if (Boolean.parseBoolean(user.getAcceptTOS())) {
            actor.attemptsTo(
                    Click.on(RegistrationPageObject.ACCEPT_TOS)
            );
        }

        actor.attemptsTo(
                Click.on(RegistrationPageObject.SUBMIT)
        );
    }
}
