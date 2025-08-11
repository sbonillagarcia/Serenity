package userinterface.falabella_ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrationPageObject {

    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.name("firstName"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.name("lastName"));

    public static final Target EMAIL = Target.the("Email field")
            .located(By.name("email"));

    public static final Target ID_TYPE_DROPDOWN = Target.the("Document type dropdown")
            .located(By.xpath("//button[contains(@id,'menu-button') and @aria-haspopup='menu']"));

    public static final Target CC_OPTION = Target.the("CC option")
            .located(By.xpath("//button[@role='menuitem' and contains(text(),'CC (cédula de ciudadanía)')]"));

    public static final Target CE_OPTION = Target.the("CE option")
            .located(By.xpath("//button[@role='menuitem' and contains(text(),'CE (cédula de extranjería)')]"));

    public static final Target ID_NUMBER = Target.the("Document number field")
            .located(By.name("documentNumber"));

    public static final Target CONFIRM_ID = Target.the("Confirm document number field")
            .located(By.name("confirmDocumentNumber"));

    public static final Target PHONE_NUMBER = Target.the("Phone number field")
            .located(By.name("phoneNumber"));

    public static final Target PASSWORD = Target.the("Password field").located(By.name("password"));

    public static final Target VIEWER = Target.the("viewer").located(By.name("button[aria-label='Show password']"));

    public static final Target ACCEPT_TOS = Target.the("Accept terms of service checkbox")
            .located(By.xpath("//input[@id='acceptedTos']"));

    public static final Target TERMS = Target.the("Terms and conditions link")
            .located(By.xpath("//a[contains(@href,'terminos-y-condiciones')]"));

    public static final Target SUBMIT = Target.the("Create account button")
            .located(By.xpath("//button[contains(text(),'Crear cuenta')]"));

    public static final Target REGISTRATION_MESSAGE = Target.the("Registration success message")
            .located(By.xpath("//h3[contains(text(),'¡Hola!')] | //div[contains(text(),'Registro exitoso')]"));

}
