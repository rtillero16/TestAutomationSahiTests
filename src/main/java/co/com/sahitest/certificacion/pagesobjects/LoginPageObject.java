package co.com.sahitest.certificacion.pagesobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")

public class LoginPageObject extends PageObject {

    By CAMPO_LOGIN = By.name("user");
    By CAMPO_PASSWORD = By.name("password");
    By BTN_LOGIN = By.xpath("//input[@class='button']");
    By LBL_MENSAJE = By.xpath("//*[@id='available']/h2");

    public void escribirUsuario(String username){
        getDriver().findElement(CAMPO_LOGIN).sendKeys(username);
    }

    public void escribirClave(String password){
        getDriver().findElement(CAMPO_PASSWORD).sendKeys(password);
    }

    public void clicBotonLogin(){
        getDriver().findElement(BTN_LOGIN).click();
    }

    public void validarMensaje(){
        Assert.assertTrue(getDriver().findElement(LBL_MENSAJE).getText().equals("All available books"));
    }
}
