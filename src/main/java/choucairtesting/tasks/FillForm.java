package choucairtesting.tasks;

import choucairtesting.util.utilities;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import java.util.List;
import static choucairtesting.userinterface.UtestFormStepOne.*;
import static choucairtesting.userinterface.UtestFormStepTwo.*;
import static choucairtesting.userinterface.UtestFormStepThree.*;
import static choucairtesting.userinterface.UtestFormStepFour.*;

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
                Enter.theValue(utilities.RamdomNumber()+ dt.get(0).getStrEmail()).into(EMAILADDRESS),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(2)).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(1)).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(3)).from(SELECT_YEAR),
                Click.on(BUTTONNEXT),

                //STEP TWO
                Click.on(CITY),
                Enter.theValue(dt.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(dt.get(0).getStrPostalCode()).into(POSTALCODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(dt.get(0).getStrCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY),
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