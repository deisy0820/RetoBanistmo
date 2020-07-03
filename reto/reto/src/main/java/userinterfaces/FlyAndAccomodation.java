package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlyAndAccomodation {
    public static final Target ORIGIN = Target.the("Origin").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div/input"));
    public static final Target DESTINATION = Target.the("Destination").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/input"));
    public static final Target GO_CALENDER = Target.the("Go calender").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[3]/div[2]/div[1]/div/input"));
    public static final Target DATE_GO = Target.the("Date go").located(By.xpath("/html/body/div[11]/div/div[5]/div[1]/div[4]/span[22]"));
    public static final Target RETURN = Target.the("Return").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[3]/div[2]/div[2]/div/input"));
    public static final Target DATE_RETURN = Target.the("Date return").located(By.id("/html/body/div[13]/div/div[5]/div[2]/div[4]/span[11]/span[1]"));
    public static final Target ROOMS = Target.the("Rooms").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[4]/div/div[5]/div/div"));
    public static final Target ADD_ROOMS = Target.the("Add rooms").located(By.xpath("/html/body/div[10]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/a[2]"));
    public static final Target APLY = Target.the("Apli").located(By.xpath("/html/body/div[10]/div/div[2]/a[1]"));
    public static final Target SEARCH = Target.the("Search").located(By.xpath("//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[5]/div/a/em"));
    public static final Target ORIG_COU = Target.the("Orig cou").located(By.xpath("/html/body/div[19]/div/div/ul/li/i"));







}
