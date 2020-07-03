package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.StartFour;

public class EnterStarFour implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(StartFour.STAR));

    }
    public static EnterStarFour is() {
        return new EnterStarFour();
    }
}
