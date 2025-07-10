package questions;

import net.serenitybdd.screenplay.Question;
import userinterface.LoginPage;

public class LoginResult {

    public static Question<String> message() {
        return actor -> LoginPage.WELCOME_MESSAGE.resolveFor(actor).getText();
    }
}
