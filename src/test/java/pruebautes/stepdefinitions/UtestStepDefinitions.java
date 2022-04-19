package pruebautes.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import pruebautes.model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebautes.questions.Answer;
import pruebautes.tasks.FillForm;
import pruebautes.tasks.OpenUp;

import java.util.List;
import java.util.regex.Matcher;

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
        theActorInTheSpotlight().attemptsTo(FillForm.onTheForm(utestData));
    }

    @Then("^check for successful registration$")
    public void checkForSuccessfulRegistration(List<UtestData>utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer
                .toThe(utestData.get(0).getStrVerificationText())));
    }
}
