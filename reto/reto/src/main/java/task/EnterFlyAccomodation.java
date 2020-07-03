package task;

import integrations.JSClick;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterfaces.FlyAndAccomodation;
import userinterfaces.StartFour;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterFlyAccomodation implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
//        actor.attemptsTo(Enter.theValue("medellin").into(FlyAndAccomodation.ORIGIN));
//        actor.attemptsTo(JSClick.on(FlyAndAccomodation.ORIG_COU));
//        actor.attemptsTo(Enter.theValue("cal").into(FlyAndAccomodation.DESTINATION).thenHit(Keys.ENTER));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.GO_CALENDER));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.DATE_GO));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.DATE_RETURN));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.ROOMS));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.ADD_ROOMS));
//        actor.attemptsTo(Scroll.to(FlyAndAccomodation.APLY));
//        actor.attemptsTo(Click.on(FlyAndAccomodation.SEARCH));



    }

    public static EnterFlyAccomodation is() {
        return new EnterFlyAccomodation();
    }
}
