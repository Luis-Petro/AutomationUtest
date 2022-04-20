package choucairtesting.tasks;

import choucairtesting.util.utilities;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import static choucairtesting.userinterface.UtestFormStepOne.*;

public class FillFormStepOne implements Task {

    private List<UtestData> dt;

    public FillFormStepOne(List<UtestData> dt) {
        this.dt = dt;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTONJOINTODAY),

                //STEP ONE, PERSONAL INFO
                Enter.theValue(dt.get(0).getStrFirstName()).into(FIRSTNAME),
                Enter.theValue(dt.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(utilities.RamdomNumber()+ dt.get(0).getStrEmail()).into(EMAILADDRESS),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(2)).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(1)).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(dt.get(0).getStrDateOfBirth(3)).from(SELECT_YEAR),
                Click.on(BUTTONNEXT)
        );
    }

    public static FillFormStepOne onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillFormStepOne.class, dt);
    }
}
