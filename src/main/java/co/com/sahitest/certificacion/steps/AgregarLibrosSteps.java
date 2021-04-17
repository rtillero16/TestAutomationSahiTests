package co.com.sahitest.certificacion.steps;

import co.com.sahitest.certificacion.pagesobjects.AgregarLibrosPageObject;
import net.thucydides.core.annotations.Step;

public class AgregarLibrosSteps {
    AgregarLibrosPageObject agregarLibrosPOM = new AgregarLibrosPageObject();

    @Step
    public void limpiarCampos() {
        agregarLibrosPOM.limpiarCampos();
    }

    @Step
    public void ingresarCantidadJava(String coreJava) {
        agregarLibrosPOM.ingresarCantidadJava(coreJava);
    }

    @Step
    public void ingresarCantidadRuby(String rubyForRail) {
        agregarLibrosPOM.ingresarCantidadRuby(rubyForRail);
    }

    @Step
    public void ingresarCantidadPython(String pythonCookbook) {
        agregarLibrosPOM.ingresarCantidadPython(pythonCookbook);
    }

    @Step
    public void agregarLibros() {
        agregarLibrosPOM.agregarLibros();
    }

    @Step
    public void valorTotal() {
        agregarLibrosPOM.valorTotal();
    }
}
