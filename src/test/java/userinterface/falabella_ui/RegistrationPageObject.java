package userinterface.falabella_ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPageObject {

    public static final Target FIRST_NAME = Target.the("name").locatedBy(By.xpath());
    public static final Target LAST_NAME = Target.the("lastname").locatedBy(By.xpath());
    public static final Target EMAIL = Target.the("email").locatedBy(By.xpath());
    public static final Target PASSWORD = Target.the("password").locatedBy(By.xpath());
    public static final Target TERMS = Target.the("terms").locatedBy(By.xpath());
    public static final Target SUBMIT = Target.the("submitbutton").locatedBy(By.xpath());
}
