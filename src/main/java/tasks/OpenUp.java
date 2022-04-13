package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestHomePage;

public class OpenUp implements Task {
    UtestHomePage utestHomePage;
    public  static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(utestHomePage));
    }
}