package choucairtesting.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.List;

import static choucairtesting.userinterface.UtestFormStepTwo.*;


public class FillFormStepTwo implements Task {

    private List<UtestData> dt;

    public FillFormStepTwo(List<UtestData> dt) {
        this.dt = dt;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //STEP TWO, LOCATION DATA
                Click.on(CITY),
                Enter.theValue(dt.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(dt.get(0).getStrPostalCode()).into(POSTALCODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(dt.get(0).getStrCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY),
                Click.on(NEXTDEVICES)
        );
    }

    public static FillFormStepTwo onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillFormStepTwo.class, dt);
    }
}
