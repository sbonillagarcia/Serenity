package questions.falabella_questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class RegistrationUrl implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }

    public static Question<String> is(){
        return new RegistrationUrl();
    }
}
