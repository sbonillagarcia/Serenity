package tasks.falabella_tasks;

import models.falabella_models.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterContactInformation implements Task {

    private final UserData userData;

    public EnterContactInformation(UserData userData){

        this.userData = userData;
    }

   // String randomEmail = "tyifyedof" + System.currentTimeMillis() ; --Si no tengo alternativa

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(userData.getEmail()).into(RegistrationPageObject.EMAIL),
                Hit.the(Keys.TAB).into(RegistrationPageObject.EMAIL),
                //DEBO AGREGAR SELECTOR DE CORREO GMAIL SI NO HAY DE OTRA
                Click.on(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(userData.getPhoneNumber()).into(RegistrationPageObject.PHONE_NUMBER)
        );

    }


    public static EnterContactInformation withData (UserData userData){
        return instrumented(EnterContactInformation.class, userData);
    }

}
