package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptTermsAndConditions implements Task {

    private final UserData userData;

    public AcceptTermsAndConditions(UserData userData){

        this.userData = userData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(Boolean.TRUE.equals(userData.isAcceptTOS())){
            actor.attemptsTo(
                    Click.on(RegistrationPageObject.ACCEPT_TOS)
            );
        }

        if(Boolean.TRUE.equals(userData.isTerms())){
            actor.attemptsTo(
                    Click.on(RegistrationPageObject.TERMS)
            );
        }

    }

    public static AcceptTermsAndConditions withData (UserData userData){
        return instrumented (AcceptTermsAndConditions.class,userData);
    }
}
