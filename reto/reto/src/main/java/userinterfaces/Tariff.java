package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Tariff {

    public static final Target TARIFF = Target.the("Tariff").located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target PDF = Target.the("Pdf").located(By.xpath(" //*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a/img"));




}
