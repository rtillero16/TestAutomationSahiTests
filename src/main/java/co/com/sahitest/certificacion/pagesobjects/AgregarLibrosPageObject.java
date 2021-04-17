package co.com.sahitest.certificacion.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AgregarLibrosPageObject extends PageObject {

    By CAMPO_JAVA = By.xpath("(//input[@name='q'])[1]");
    By CAMPO_RUBY = By.xpath("(//input[@name='q'])[2]");
    By CAMPO_PYTHON = By.xpath("(//input[@name='q'])[3]");
    By BTN_LIMPIAR = By.xpath("//input[@onclick='clearCart()']");
    By BTN_AGREGAR = By.xpath("//input[@onclick='addToCart()']");
    By CAMPO_TOTAL = By.id("total");

    public void limpiarCampos() {
        getDriver().findElement(BTN_LIMPIAR).click();
    }

    public void ingresarCantidadJava(String coreJava) {
        getDriver().findElement(CAMPO_JAVA).sendKeys(coreJava);
    }

    public void ingresarCantidadRuby(String rubyForRail) {
        getDriver().findElement(CAMPO_RUBY).sendKeys(rubyForRail);
    }

    public void ingresarCantidadPython(String pythonCookbook) {
        getDriver().findElement(CAMPO_PYTHON).sendKeys(pythonCookbook);
    }

    public void agregarLibros() {
        getDriver().findElement(BTN_AGREGAR).click();
    }

    public void valorTotal() {
        String texto = getDriver().findElement(By.id("total")).getText();
        Assert.assertTrue(getDriver().findElement(CAMPO_TOTAL).getText().equals(texto));
    }
}
