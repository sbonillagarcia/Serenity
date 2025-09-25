package tasks.falabella_tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.falabella_ui.RegistrationPageObject;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class EnterOTPInnformation {

    public static Performable code(String otp) {

        return Task.where("{0} enters the OTP code",
                actor -> {
                    var inputs = RegistrationPageObject.OTP_INPUTS.resolveAllFor(actor);

                    IntStream.range(0, Math.min(otp.length(), inputs.size()))
                            .forEach(i ->
                                    actor.attemptsTo(
                                            Enter.theValue(Character.toString(otp.charAt(i)))
                                                    .into(inputs.get(i))
                                    )
                            );
                }
        );


    }

}
