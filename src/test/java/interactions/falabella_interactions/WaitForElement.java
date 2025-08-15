package interactions.falabella_interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitForElement implements Interaction {

    private final Target target;

    public WaitForElement(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static WaitForElement toBeVisible(Target target) {
        return instrumented(WaitForElement.class, target);
    }
}
