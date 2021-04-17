package co.com.sahitest.certificacion.stepdefinitions;

import co.com.sahitest.certificacion.models.Login;
import co.com.sahitest.certificacion.steps.LoginSteps;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;


    @Dado("^que el usuario esta en la pagina de sahitest$")
    public void queElUsuarioEstaEnLaPaginaDeSahitest() {
        loginSteps.abrirPaginaSahitest();
    }

    @Cuando("^ingresa las credencias$")
    public void ingresaLasCredencias(List<Login> listaLogin) {
        loginSteps.escribirUsuario(listaLogin.get(0).getUsername());
        loginSteps.escribirClave(listaLogin.get(0).getPassword());
        loginSteps.clicBotonLogin();
    }

    @Entonces("^el visualizara el mensaje All available books$")
    public void elVisualizaraElMensajeAllAvailableBooks() {
        loginSteps.validarMensaje();
    }
}
