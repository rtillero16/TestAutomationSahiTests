package co.com.sahitest.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregar_libros.feature",
        glue = "co.com.sahitest.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AgregarLibrosRunner {

}
