package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StartFour {
    public static final Target STAR = Target.the("Start").located(By.xpath("//*[@id=\"filtersHolder\"]/ul[3]/li[1]/ul/li[3]/span/span[1]/span/label/i"));

}
