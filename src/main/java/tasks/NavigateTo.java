package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import userinterface.UtestHomePage;

public class NavigateTo implements Task {

    public static NavigateTo onTheButtonJoin() {
        return Tasks.instrumented(NavigateTo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestHomePage.BUTTONJOINTODAY));


    }



}