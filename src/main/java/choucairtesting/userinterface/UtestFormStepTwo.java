package choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepTwo {

    public static final Target CITY =  Target.the("City").located(net.serenitybdd.core.annotations.findby.By.id("city"));
    public static final Target POSTALCODE =Target.the("Postal Code").located(By.id("zip"));
    public static final Target COUNTRY =  Target.the("Coutry").located(By.xpath("//a[contains(@class,'caret pull-right')]"));
    public static final Target NEXTDEVICES = Target.the("Next Devices").located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(text(), 'Next: Devices')]"));

}
