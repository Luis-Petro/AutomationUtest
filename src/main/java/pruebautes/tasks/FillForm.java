package pruebautes.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pruebautes.model.UtestData;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.concurrent.TimeUnit;


import static pruebautes.userinterface.UtestForm.*;


public class FillForm implements Task {

    private List<UtestData> dt;

    public FillForm(List<UtestData> dt) {
        this.dt = dt;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTONJOINTODAY),

                //STEP ONE
                Enter.theValue(dt.get(0).getStrFirstName()).into(FIRSTNAME),
                Enter.theValue(dt.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(dt.get(0).getStrEmail()).into(EMAILADDRESS),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(2)).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(1)).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(3)).from(SELECT_YEAR),
                Click.on(BUTTONNEXT),

                //STEP TWO
                Enter.theValue(dt.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(dt.get(0).getStrPostalCode()).into(POSTALCODE),
                Click.on(NEXTDEVICES),

                //STEP THREE
                Click.on(COMPUTER),
                Enter.theValue(dt.get(0).getStrComputer()).into(INPUT_COMPUTER).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(SELECT_VERSION),
                Enter.theValue(dt.get(0).getStrComputer()).into(INPUT_VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(SELECT_LANGUAGE),
                Enter.theValue(dt.get(0).getStrComputer()).into(INPUT_LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),


                Click.on(SELECT_MOBILE),
                Enter.theValue(dt.get(0).getStrMobileDevice()).into(INPUT_MOBILE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(SELECT_MODEL),
                Enter.theValue(dt.get(0).getStrModelMobile()).into(INPUT_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(SELECT_OPERATING_SYSTEM),
                Enter.theValue(dt.get(0).getStrSoMobile()).into(INPUT_OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),

                Click.on(NEXT_LAST_STEP),

                //STEP FOUR
                Enter.theValue(dt.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(dt.get(0).getStrPassword()).into(INPUT_CONFIRM_PASSWORD),

                Click.on(CHECKBOX_POLICY),
                Click.on(CHECKBOX_TERMS),
                Click.on(TEXT_FINAL),
                Click.on(FINAL)

        );


    }

    public static FillForm onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillForm.class, dt);
    }
}
