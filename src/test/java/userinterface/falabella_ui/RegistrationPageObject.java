package userinterface.falabella_ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPageObject {

    public static final Target FIRST_NAME = Target.the("firstName").locatedBy(By.xpath());
    public static final Target LAST_NAME = Target.the("lastName").locatedBy(By.xpath());
    public static final Target EMAIL = Target.the("email").locatedBy(By.xpath());
    public static final Target ID_TYPE = Target.the("idType").locatedBy(By.xpath());
    public static final Target ID_NUMBER = Target.the("idNumber").locatedBy(By.xpath());
    public static final Target CONFIRM_ID = Target.the("confirmId").locatedBy(By.xpath());
    public static final Target PHONE_NUMBER = Target.the("phoneNumber").locatedBy(By.xpath());
    public static final Target PASSWORD = Target.the("password").locatedBy(By.xpath());
    public static final Target VIEWER = Target.the("viewer").locatedBy(By.xpath());
    public static final Target ACCEPT_TOS = Target.the("acceptTOS").locatedBy(By.xpath());
    public static final Target TERMS = Target.the("terms").locatedBy(By.xpath());
    public static final Target SUBMIT = Target.the("submitbutton").locatedBy(By.xpath());


}
