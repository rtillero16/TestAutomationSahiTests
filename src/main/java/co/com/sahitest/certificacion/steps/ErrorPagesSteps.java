package co.com.sahitest.certificacion.steps;

import co.com.sahitest.certificacion.pagesobjects.ErrorPagesPageObject;
import net.thucydides.core.annotations.Step;

public class ErrorPagesSteps {
    ErrorPagesPageObject errorPagesPageObject = new ErrorPagesPageObject();

    @Step
    public void abrirPagina(){
        errorPagesPageObject.open();
    }

    @Step
    public void clicErrorPages(){
        errorPagesPageObject.clicErrorPages();
    }

    @Step
    public void clicErrorPageQuinientos(){
        errorPagesPageObject.clicErrorPageQuinientos();
    }

    @Step
    public void validarPresenciaBoton(){
        errorPagesPageObject.validarPresenciaBoton();
    }
}
