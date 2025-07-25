package tasks.falabella_tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    private final String firstname;
    private final String lastName;
    private final String email;
    private final String password;


    public Register(String firstname,String lastName,String email,String password){
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public static Register withData(String firstname,String lastName,String email,String password){
        return instrumented(Register.class, firstname, lastName, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(RegistrationPageObject.FIRST_NAME),
                Enter.theValue(firstname).into(RegistrationPageObject.LAST_NAME),
                Enter.theValue(firstname).into(RegistrationPageObject.EMAIL),
                Enter.theValue(firstname).into(RegistrationPageObject.PASSWORD),
                Click.on(RegistrationPageObject.TERMS),
                Click.on(RegistrationPageObject.SUBMIT)

        );

    }

    @Override
    public Performable then(Performable nextPerformable) {
        return Task.super.then(nextPerformable);
    }
}
