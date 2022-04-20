package choucairtesting.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepOne {

    public static final Target BUTTONJOINTODAY = Target.the("Button join today").located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target FIRSTNAME       = Target.the("First Name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME  = Target.the("Last Name").located(By.id("lastName"));
    public static final Target EMAILADDRESS    = Target.the("Email").located(By.id("email"));
    public static final Target SELECT_MONTH    = Target.the("Month").located(net.serenitybdd.core.annotations.findby.By.id("birthMonth")) ;
    public static final Target SELECT_DAY      = Target.the("Day").located(net.serenitybdd.core.annotations.findby.By.id("birthDay"));
    public static final Target SELECT_YEAR     = Target.the("Year").located(net.serenitybdd.core.annotations.findby.By.id("birthYear"));
    public static final Target BUTTONNEXT      = Target.the("Button Next").located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(text(), 'Next: Location')]"));

}
