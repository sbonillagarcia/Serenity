package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME = Target.the("username field").located(By.id("username"));
    public static final Target PASSWORD = Target.the("password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.id("loginButton"));
    public static final Target WELCOME_MESSAGE = Target.the("Welcome_message").located(By.id("welcome_message"));

}
