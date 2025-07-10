package tasks;

import models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.getUsername()).into(LoginPage.USERNAME),
                Enter.theValue(credentials.getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    /**
     * Permite usar el Login con un objeto Credentials.
     */
    public static Login withCredentials(Credentials credentials) {
        return instrumented(Login.class, credentials);
    }

    /**
     * Permite usar el Login directamente con usuario y contraseña.
     */
    public static Login withCredentials(String username, String password) {
        return instrumented(Login.class, new Credentials(username, password));
    }
}

