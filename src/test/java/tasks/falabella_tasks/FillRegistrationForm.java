package tasks.falabella_tasks;

import interactions.falabella_interactions.WaitForElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.falabella_ui.RegistrationPageObject;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillRegistrationForm implements Task {

    private final Map<String, String> data;

    public FillRegistrationForm() {
        this.data = null;
    }

    public FillRegistrationForm(Map<String, String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

              actor.attemptsTo(
                Enter.theValue(data.get("email")).into(RegistrationPageObject.EMAIL),
                Enter.theValue(data.get("firstName")).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(data.get("lastName")).into(RegistrationPageObject.LAST_NAME),

             /*   // Forzar cambio
                Click.on(RegistrationPageObject.ID_TYPE_DROPDOWN),
                WaitUntil.the(alternativeOption, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(alternativeOption),

                // Seleccionar la opción correcta
                Click.on(RegistrationPageObject.ID_TYPE_DROPDOWN),
                WaitUntil.the(optionToSelect, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(optionToSelect),*/

                // Continuar llenando el formulario
                //WaitUntil.the(RegistrationPageObject.ID_NUMBER, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(data.get("idNumber")).into(RegistrationPageObject.ID_NUMBER),
                Enter.theValue(data.get("confirmId")).into(RegistrationPageObject.CONFIRM_ID),
                Enter.theValue(data.get("phoneN")).into(RegistrationPageObject.PHONE_NUMBER),
                Enter.theValue(data.get("password")).into(RegistrationPageObject.PASSWORD),

                Click.on(RegistrationPageObject.ACCEPT_TOS),
                Click.on(RegistrationPageObject.TERMS),
                Click.on(RegistrationPageObject.SUBMIT)
        );
    }

    public static FillRegistrationForm withData(Map<String, String> data) {
        return instrumented(FillRegistrationForm.class, data);
    }
}
