package co.com.utest.proyectobase.stepdefinitions;

import co.com.utest.proyectobase.model.UtestData;
import co.com.utest.proyectobase.questions.ValidaRegistro;
import co.com.utest.proyectobase.tasks.OpenUp;
import co.com.utest.proyectobase.tasks.ProcesoRegistro;
import co.com.utest.proyectobase.tasks.ProcesoRegistro2;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que ana quiere registrarse en la pagina de Utest$")
    public void queAnaQuiereRegistrarseEnLaPaginaDeUtest() {
      OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage());
    }


    @When("^complete todo el formulario de registro de la pagina de Utest$")
    public void completeTodoElFormularioDeRegistroDeLaPaginaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProcesoRegistro.the(utestData.get(0).getStrUser(),utestData.get(0).getStrApellido(),utestData.get(0).getStrEmail(),utestData.get(0).getStrMes(),utestData.get(0).getStrDia(),utestData.get(0).getStrAnio()));
        OnStage.theActorInTheSpotlight().attemptsTo(ProcesoRegistro2.the(utestData.get(0).getStrMarcaCel(),utestData.get(0).getStrVersionCel(),utestData.get(0).getStrPassword(),utestData.get(0).getStrConfirmPassword()));
    }

    @Then("^podra ver el contenido de la pagina$")
    public void podraVerElContenidoDeLaPagina(List<UtestData> utestData) {
     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidaRegistro.toThe(utestData.get(0).getStrMensaje())));
    }


}
