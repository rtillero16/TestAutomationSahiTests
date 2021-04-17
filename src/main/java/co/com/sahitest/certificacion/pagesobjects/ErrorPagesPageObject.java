package co.com.sahitest.certificacion.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import static org.junit.Assert.assertThat;

@DefaultUrl("http://sahitest.com/demo/")

public class ErrorPagesPageObject extends PageObject {

    By LINK_ERROR_PAGES = By.xpath("//a[@href='errorPages.htm']");
    By LINK_ERROR_QUINIENTOS = By.xpath("//a[@href='/demo/php/500.php']");
    By BTN_VOLVER_A_CARGAR = By.id("reload-button");

    public void clicErrorPages(){
        getDriver().findElement(LINK_ERROR_PAGES).click();
    }

    public void clicErrorPageQuinientos(){
        getDriver().findElement(LINK_ERROR_QUINIENTOS).click();
    }

    public void validarPresenciaBoton(){
        assertThat(getDriver().findElement(BTN_VOLVER_A_CARGAR).isDisplayed(), Matchers.is(true));
    }
}
