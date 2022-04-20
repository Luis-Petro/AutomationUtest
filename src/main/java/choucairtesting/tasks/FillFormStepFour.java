package choucairtesting.tasks;

import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static choucairtesting.userinterface.UtestFormStepFour.*;


public class FillFormStepFour implements Task {

    private List<UtestData> dt;

    public FillFormStepFour(List<UtestData> dt) {
        this.dt = dt;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //STEP FOUR, PASSWORD
                Enter.theValue(dt.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(dt.get(0).getStrPassword()).into(INPUT_CONFIRM_PASSWORD),

                Click.on(CHECKBOX_POLICY),
                Click.on(CHECKBOX_TERMS),
                Click.on(TEXT_FINAL),
                Click.on(FINAL)
        );

    }

    public static FillFormStepFour onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillFormStepFour.class, dt);
    }

}
