package pruebautes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebautes.userinterface.UtestForm;

public class Answer implements Question{
    private String question;



    public static Answer toThe() {
        return new Answer();
    }



    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(UtestForm.TEXT_FINAL).viewedBy(actor).asString();
    }
}