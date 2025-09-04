package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterPersonalInformation implements Task {

    private final UserData userData;

    public EnterPersonalInformation (UserData userData){
        this.userData=userData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(userData.getFirstName()).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(userData.getLastName()).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(userData.getIdNumber()).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(userData.getConfirmId()).into(RegistrationPageObject.CONFIRM_ID)

        );
    }

    public static EnterPersonalInformation withData (UserData userData){
        return instrumented(EnterPersonalInformation.class, userData);
    }
}
