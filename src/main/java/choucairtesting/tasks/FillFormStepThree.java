package choucairtesting.tasks;

import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static choucairtesting.userinterface.UtestFormStepThree.*;

public class FillFormStepThree implements Task {

    private List<UtestData> dt;

    public FillFormStepThree(List<UtestData> dt) {
        this.dt = dt;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //STEP THREE DEVICES INFO
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

                Click.on(NEXT_LAST_STEP)
        );
    }

    public static FillFormStepThree onTheForm(List<UtestData> dt) {
        return Tasks.instrumented(FillFormStepThree.class, dt);
    }
}
