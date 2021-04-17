package co.com.sahitest.certificacion.stepdefinitions;

import co.com.sahitest.certificacion.models.CantidadLibros;
import co.com.sahitest.certificacion.models.Login;
import co.com.sahitest.certificacion.steps.AgregarLibrosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class AgregarLibroStepDefinitions {

    @Steps
    AgregarLibrosSteps agregarLibrosSteps;

    @Cuando("^agrega libros a la canasta de compra$")
    public void agregaLibrosALaCanastaDeCompra(List<CantidadLibros> listaCantidadLibros) {
        agregarLibrosSteps.limpiarCampos();
        agregarLibrosSteps.ingresarCantidadJava(listaCantidadLibros.get(0).getCoreJava());
        agregarLibrosSteps.ingresarCantidadRuby(listaCantidadLibros.get(0).getRubyForRail());
        agregarLibrosSteps.ingresarCantidadPython(listaCantidadLibros.get(0).getPythonCookbook());
        agregarLibrosSteps.agregarLibros();
    }

    @Entonces("^el visualizara \"([^\"]*)\" en el Valor Total$")
    public void elVisualizaraEnElValorTotal(String texto) {
        agregarLibrosSteps.valorTotal();
    }
}
