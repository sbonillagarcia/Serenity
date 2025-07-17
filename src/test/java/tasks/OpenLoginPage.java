package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.LoginPageObject;

public class OpenLoginPage {
    public static Performable url(){
        return Task.where("{0} opens the login page",
           Open.browserOn().the(LoginPageObject.class)
        );
    }
}
