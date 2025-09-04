package interactions.falabella_interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitForElement implements Interaction {

    private final Target target;
    private final int timeout;

    public WaitForElement(Target target, int timeout) {
        this.target = target;
        this.timeout  = timeout ;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(timeout).seconds()
        );
    }

    public static WaitForElement toBeVisible(Target target, int timeout) {
        return instrumented(WaitForElement.class, target, timeout);
    }
}
