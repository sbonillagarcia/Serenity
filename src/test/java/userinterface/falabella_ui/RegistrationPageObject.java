package userinterface.falabella_ui;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPageObject {

    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.name("firstName"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.name("lastName"));

    public static final Target EMAIL = Target.the("Email field")
            .located(By.name("email"));
    public static final Target MAIL_TYPE = Target.the("id_type")
    .located(By.xpath("//"));

    public static final Target ID_TYPE_DROPDOWN = Target.the("Document type dropdown")
            .located(By.xpath("//button[contains(@id,'menu-button') and @aria-haspopup='menu']"));

    public static final Target CC_OPTION = Target.the("CC option")
            .located(By.cssSelector("option[value='CC']"));

    public static final Target CE_OPTION = Target.the("CE option")
            .located(By.cssSelector("option[value='CE']"));

    public static final Target ID_NUMBER = Target.the("Document number field")
            .located(By.cssSelector("input[name='document']"));

    public static final Target CONFIRM_ID = Target.the("Confirm document number field")
            .located(By.cssSelector("input[name='documentIdValidator']"));

    public static final Target PHONE_NUMBER = Target.the("Phone number field")
            .located(By.name("phoneNumber"));

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.name("password"));
    // Botón "ojo" para mostrar contraseña (usamos aria-label)
    public static final Target VIEWER = Target.the("Password eye button")
            .located(By.xpath("//button[@aria-label='Show password']"));

    // Checkbox de aceptar términos — XPath tolerant al naming
    public static final Target ACCEPT_TOS = Target.the("Accept terms of service checkbox")
            .located(By.xpath("(//span[contains(@class,'chakra-checkbox__control')])[1]"));

    public static final Target TERMS = Target.the("Terms and conditions link")
            .located(By.xpath("(//span[contains(@class,'chakra-checkbox__control')])[2]"));

    public static final Target SUBMIT = Target.the("Create account button")
            .located(By.xpath("//button[contains(text(),'Regístrate')]"));

    public static final Target REGISTRATION_MESSAGE = Target.the("Registration success message")
            .located(By.xpath("//p[contains(text(),'Solo falta validar tu correo')]"));

    public static final Target OTP_INPUTS = Target.the("OTP inputs")
            .locatedBy("input.chakra-pin-input");

    public static final Target SUBMIT_OTP = Target.the("Validate and create account button")
            .located(By.xpath("//button[contains(text(),'Validar y crear cuenta')]"));

    public static final Target WELCOME_MESSAGE = Target.the("Welcome message")
            .located(By.xpath("//*[contains(text(),'Te damos la bienvenida a Falabella')]"));



}
