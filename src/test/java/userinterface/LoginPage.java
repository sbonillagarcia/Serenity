package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME = Target.the("username field").located(By.cssSelector("input[name='username']"));
    public static final Target PASSWORD = Target.the("password field").located(By.cssSelector("input[name='password']"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.cssSelector("button[type='submit']"));
    public static final Target WELCOME_MESSAGE = Target.the("Welcome_message") .located(By.cssSelector(".oxd-alert-content-text"));

}
