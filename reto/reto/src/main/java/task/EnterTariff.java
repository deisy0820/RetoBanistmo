package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Tariff;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class EnterTariff implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Tariff.TARIFF));
        actor.attemptsTo(Click.on(Tariff.PDF));


    }
    public static EnterTariff is() {
        return new EnterTariff();
    }
}
