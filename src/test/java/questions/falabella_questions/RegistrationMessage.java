package questions.falabella_questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.falabella_ui.RegistrationPageObject;

public class RegistrationMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return RegistrationPageObject.REGISTRATION_MESSAGE.resolveFor(actor).getText();
    }

    public static RegistrationMessage text() {
        return new RegistrationMessage();
    }
}

