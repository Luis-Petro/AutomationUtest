package choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepThree {
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


}
