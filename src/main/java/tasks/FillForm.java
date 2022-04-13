package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.apache.commons.logging.impl.WeakHashtable;
import org.openqa.selenium.Keys;
import userinterface.UtestForm;

import java.util.List;

public class FillForm implements Task {

    private List<UtestData> Data;

    public FillForm (List<UtestData> Data){
        this.Data = Data;
    }


    public static FillForm onTheForm(List<UtestData> Data){

        return Tasks.instrumented(FillForm.class, Data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("Data.get(0).getFirstName()").into(UtestForm.FIRSTNAME),
                Enter.theValue("LastName").into(UtestForm.LASTNAME),
                Enter.theValue("Catatumbo@gmail.com").into(UtestForm.EMAILADDRESS),
                SelectFromOptions.byVisibleText("October").from(UtestForm.SELECT_MONTH),
                SelectFromOptions.byVisibleText("15").from(UtestForm.SELECT_DAY),
                SelectFromOptions.byVisibleText("1994").from(UtestForm.SELECT_YEAR),
                Click.on(UtestForm.BUTTONNEXT),
                Enter.theValue("Montería"+ Keys.DOWN).into(UtestForm.CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestForm.CITY),
                Enter.theValue("102029").into(UtestForm.POSTALCODE)
                );


    }
        //
        // MoveMouse.to(PROFILE_BUTTON)
    }
