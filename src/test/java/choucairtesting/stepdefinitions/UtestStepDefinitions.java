package choucairtesting.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import choucairtesting.model.UtestData;
import net.serenitybdd.screenplay.actors.*;
import choucairtesting.questions.Answer;
import choucairtesting.tasks.*;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class UtestStepDefinitions {

    @Before
    public void  setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than user enters the website$")
    public void thanUserEntersTheWebsite() {OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage());}


    @When("^you fill out the registration form$")
    public void youFillOutTheRegistrationForm(List<UtestData>utestData) {
        theActorInTheSpotlight().attemptsTo(
                FillFormStepOne.onTheForm(utestData),
                FillFormStepTwo.onTheForm(utestData),
                FillFormStepThree.onTheForm(utestData),
                FillFormStepFour.onTheForm(utestData)
                );
    }

    @Then("^check for successful registration$")
    public void checkForSuccessfulRegistration(List<UtestData>utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer
                .toThe(utestData.get(0).getStrVerificationText())));
    }
}
