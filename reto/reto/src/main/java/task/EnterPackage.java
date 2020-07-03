package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Package;


public class EnterPackage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Package.PACKAGE_FLY));
    }

    public static EnterPackage is() {
        return new EnterPackage();
    }
}
