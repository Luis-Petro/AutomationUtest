package userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestForm extends PageObject {

    public static final Target FIRSTNAME =Target.the("First Name").
            located(By.id("firstName"));
    public static final Target LASTNAME =Target.the("Last Name").
            located(By.id("lastName"));
    public static final Target EMAILADDRESS=Target.the("Last Name").
            located(By.id("email"));


    public static final Target SELECT_MONTH = Target.the("Last Name").
            located(By.id("birthMonth")) ;
    public static final Target SELECT_DAY = Target.the("Last Name").
            located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Last Name").
            located(By.id("birthYear"));
    public static final Target CITY =  Target.the("Last Name").
            located(By.id("city"));
    public static final Target BUTTONNEXT = Target.the("apartado simular").
            located(By.xpath("//span[contains(text(), 'Next: Location')]"));
    public static final Target POSTALCODE =  Target.the("Last Name").
            located(By.id("zip")) ;
}
