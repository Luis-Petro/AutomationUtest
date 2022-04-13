package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://utest.com/")
public class UtestHomePage extends PageObject {

    public static final Target BUTTONJOINTODAY = Target.the("Button join today").
            located(By.className("unauthenticated-nav-bar__sign-up")) ;

}
