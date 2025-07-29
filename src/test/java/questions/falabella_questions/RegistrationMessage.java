package questions.falabella_questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.falabella_ui.RegistrationPage;
import userinterface.falabella_ui.RegistrationPageObject;

public class RegistrationMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegistrationPage.SUBMIT).viewedBy(actor).asString();
    }

    public static Question<String> displayed(){
        return new RegistrationMessage();
    }
}
