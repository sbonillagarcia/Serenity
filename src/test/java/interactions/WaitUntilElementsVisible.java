package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitUntilElementsVisible implements Interaction {

    private final Target element;
    private final int timeoutSeconds;

    public WaitUntilElementsVisible(Target element, int timeoutSeconds) {
        this.element = element;
        this.timeoutSeconds = timeoutSeconds;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(element, isVisible()).forNoMoreThan(timeoutSeconds).seconds()
        );
    }

    public static WaitUntilElementsVisible forElement(Target element, int timeoutSeconds) {
        return instrumented(WaitUntilElementsVisible.class, element, timeoutSeconds);
    }

}

