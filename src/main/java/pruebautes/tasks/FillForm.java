package pruebautes.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebautes.model.UtestData;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;


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
                Enter.theValue(dt.get(0).getStrFirstName()).into(FIRSTNAME),
                Enter.theValue(dt.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(dt.get(0).getStrEmail()).into(EMAILADDRESS),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(2)).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(1)).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(3)).from(SELECT_YEAR),
                Click.on(BUTTONNEXT),

                Enter.theValue(dt.get(0).getStrCity()+ Keys.DOWN).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Enter.theValue(dt.get(0).getStrPostalCode()).into(POSTALCODE),
                Enter.theValue(dt.get(0).getStrCountry()).into(COUNTRY),
                Click.on(NEXTDEVICES),
                Enter.theValue(dt.get(0).getStrComputer()+ Keys.DOWN).into(COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(COMPUTER),
                Enter.theValue(dt.get(0).getStrComputerVersion()+ Keys.DOWN).into(COMPUTERVERSION),
                Hit.the(Keys.ARROW_DOWN).into(COMPUTERVERSION),
                Enter.theValue(dt.get(0).getStrLanguage()+ Keys.DOWN).into(SOLANGUAGE),
                Hit.the(Keys.ARROW_DOWN).into(SOLANGUAGE)



        );


    }

    public static FillForm onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillForm.class, dt);
    }
}
