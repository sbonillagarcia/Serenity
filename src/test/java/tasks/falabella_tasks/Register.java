package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;
import java.util.Map;
import static org.bouncycastle.cms.RecipientId.password;

public class Register implements Task {

    private final Map<String, String> data;

    public Register(Map<String, String> data){

        this.data = data;
    }


    public static Register withData(Map<String, String> data) {
        return new Register(data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(lastName).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(email).into(RegistrationPageObject.EMAIL),
                Enter.theValue(idType).into(RegistrationPageObject.ID_TYPE),
                Enter.theValue(idNumber).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(confirmId).into(RegistrationPageObject.CONFIRM_ID),
                Enter.theValue(phoneNumber).into(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(password).into(RegistrationPageObject.PASSWORD),
                Enter.theValue(viewer).into(RegistrationPageObject.VIEWER),
                Enter.theValue(acceptTOS).into(RegistrationPageObject.ACCEPT_TOS),
                Click.on(RegistrationPageObject.TERMS),
                Click.on(RegistrationPageObject.SUBMIT)
        );
    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}

