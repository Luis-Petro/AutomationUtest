package pruebautes.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pruebautes.model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebautes.tasks.FillForm;
import pruebautes.tasks.OpenUp;

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
        theActorInTheSpotlight().attemptsTo(FillForm.onTheForm(utestData));
    }
}
