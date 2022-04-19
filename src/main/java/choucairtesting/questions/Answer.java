package choucairtesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import choucairtesting.userinterface.UtestFormStepOne;

public class Answer implements Question<Boolean> {
    private String strConfirmWelcome;

    public Answer(String strConfirmWelcome) {
        this.strConfirmWelcome = strConfirmWelcome;
    }

    public static Answer toThe(String strConfirmWelcome) {return new Answer(strConfirmWelcome);}


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeText = Text.of(UtestFormStepOne.TEXT_MESSAGE).viewedBy(actor).asString();

        if (strConfirmWelcome.equals(welcomeText)) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}