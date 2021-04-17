package co.com.sahitest.certificacion.stepdefinitions;

import co.com.sahitest.certificacion.steps.ErrorPagesSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ErrorPagesStepDefinitions {

    @Steps
    ErrorPagesSteps errorPagesSteps;

    @Dado("^que el usuario esta en la pagina de sahi tests$")
    public void queElUsuarioEstaEnLaPaginaDeSahiTests() {
        errorPagesSteps.abrirPagina();
    }

    @Cuando("^selecciona la opcion Quinientos Page$")
    public void seleccionaLaOpcionQuinientosPage() {
        errorPagesSteps.clicErrorPages();
        errorPagesSteps.clicErrorPageQuinientos();
    }

    @Entonces("^el visualizara el boton Volver a cargar$")
    public void elVisualizaraElBotonVolverACargar() {
        errorPagesSteps.validarPresenciaBoton();
    }
}
