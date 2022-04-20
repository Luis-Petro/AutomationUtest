package choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepTwo {

    public static final Target CITY           = Target.the("City").located(net.serenitybdd.core.annotations.findby.By.id("city"));
    public static final Target POSTALCODE     = Target.the("Postal Code").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Select Country").located(By.xpath("//div[@name='countryId']"));
    public static final Target INPUT_COUNTRY  = Target.the("Input Country").located(By.xpath("//div[@name='countryId']//input"));
    public static final Target NEXTDEVICES    = Target.the("Next: Devices").located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(text(), 'Next: Devices')]"));

}
