package choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSuccessfulRegistrationPage {

    public static final Target TEXT_MESSAGE    = Target.the("Text Message successful registration").located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
