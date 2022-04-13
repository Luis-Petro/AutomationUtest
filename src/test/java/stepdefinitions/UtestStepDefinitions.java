package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.FillForm;
import tasks.NavigateTo;
import tasks.OpenUp;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void  setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Luis enters the website$")
    public void than_Luis_enters_the_website() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }


    @Given("^goes to Join Today$")
    public void goes_to_Join_Today() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateTo.onTheButtonJoin());
    }

    @When("^you fill out the registration form$")
    public void you_fill_out_the_registration_form(List<UtestData> utestData) {
        theActorInTheSpotlight().attemptsTo(FillForm.onTheForm(utestData));
    }
/*
    @Then("^check for successful registration$")
    public void check_for_successful_registration() {

    }
*/
}
