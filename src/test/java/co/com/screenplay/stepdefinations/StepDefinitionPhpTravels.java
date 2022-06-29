package co.com.screenplay.stepdefinations;

import co.com.screenplay.tasks.OpenUp;
import co.com.screenplay.tasks.LoginT;
import co.com.screenplay.tasks.SearchHotels;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitionPhpTravels {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^dado que usuario ingrese a phptravels$")
    public void dadoQueUsuarioIngreseAPhptravels() throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage(), (LoginT.onThePage()));
    }
    @When("^ingresa al modulo de hotels$")
    public void ingresaAlModuloDeHotels() throws Exception {
        OnStage.theActorCalled("usuario").wasAbleTo(SearchHotels.ThePageOn());
    }
    @Then("^podra hacer una reserva en el hotel$")
    public void podraHacerUnaReservaEnElHotel() throws Exception {
    }

}
