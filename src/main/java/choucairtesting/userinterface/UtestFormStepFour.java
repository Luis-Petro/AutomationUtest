package choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormStepFour {

    public static final Target INPUT_PASSWORD = Target.the("Input Password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input Confirm Password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("checkbox terms of use").located(By.id("termOfUse"));
    public static final Target CHECKBOX_POLICY = Target.the("checkbox police").located(By.id("privacySetting"));
    public static final Target TEXT_FINAL = Target.the("text to validate this test").located(By.xpath("//a[@id='laddaBtn']//span"));
    public static final Target FINAL = Target.the("Step").located(By.id("mainContent"));
}
