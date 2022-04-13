package pruebautes.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestForm  {

    public static final Target BUTTONJOINTODAY = Target.the("Button join today").
            located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target FIRSTNAME =Target.the("First Name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Last Name").
            located(By.id("lastName"));
    public static final Target EMAILADDRESS = Target.the("Email").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Month").
            located(net.serenitybdd.core.annotations.findby.By.id("birthMonth")) ;
    public static final Target SELECT_DAY = Target.the("Day").
            located(net.serenitybdd.core.annotations.findby.By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Year").
            located(net.serenitybdd.core.annotations.findby.By.id("birthYear"));
    public static final Target BUTTONNEXT = Target.the("Button Next").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(text(), 'Next: Location')]"));
    public static final Target CITY =  Target.the("City").
            located(net.serenitybdd.core.annotations.findby.By.id("city"));

    public static final Target POSTALCODE =Target.the("Postal Code").
            located(By.id("zip"));
    public static final Target COUNTRY =  Target.the("Coutry").
            located(By.xpath("//a[contains(@class,'caret pull-right')]"));
   public static final Target NEXTDEVICES = Target.the("Next Devices").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(text(), 'Next: Devices')]"));
    public static final Target COMPUTER = Target.the("Computer").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(@class, 'Select OS')]"));
    static final Target COMPUTERVERSION = Target.the("SO Computer Version").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(@class, 'Select a Version')]"));
    static final Target SOLANGUAGE= Target.the("SO Language").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//span[contains(@class, 'Select OS language')]"));
}
