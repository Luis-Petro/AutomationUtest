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
            located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_COMPUTER = Target.the("Input Computer").located(By.xpath("//div[@name='osId']//input"));

    public static final Target SELECT_VERSION = Target.the("Select Version").located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_VERSION = Target.the("Input Version").located(By.xpath("//div[@name='osVersionId']//input"));

    public static final Target SELECT_LANGUAGE = Target.the("Select Language").located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_LANGUAGE = Target.the("Input Language").located(By.xpath("//div[@name='osLanguageId']//input"));

    public static final Target SELECT_MOBILE = Target.the("Select Mobile").located(By.xpath("//div[@name='handsetMakerId']"));
    public static final Target INPUT_MOBILE = Target.the("Input Mobile").located(By.xpath("//div[@name='handsetMakerId']//input"));

    public static final Target SELECT_MODEL = Target.the("Select Model").located(By.xpath("//div[@name='handsetModelId']"));
    public static final Target INPUT_MODEL = Target.the("Input Model").located(By.xpath("//div[@name='handsetModelId']//input"));

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("Select Operating System").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("Input Operating System").located(By.xpath("//div[@name='handsetOSId']//input"));

    public static final  Target NEXT_LAST_STEP = Target.the("Nex last Step").located(By.xpath("//*[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_PASSWORD = Target.the("Input Password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("checkbox terms of use").located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY = Target.the("checkbox police").located(By.id("privacySetting"));
    public static final Target TEXT_FINAL = Target.the("text to validate this test").located(By.xpath("//a[@id='laddaBtn']//span"));


    public static final Target TEXT_MESSAGE = Target.the("Text Message").located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
