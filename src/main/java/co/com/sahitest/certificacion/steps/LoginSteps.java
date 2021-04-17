package co.com.sahitest.certificacion.steps;

import co.com.sahitest.certificacion.pagesobjects.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPageObject LoginPOM = new LoginPageObject();

    @Step
    public void abrirPaginaSahitest() {
        LoginPOM.open();
    }

    @Step
    public void escribirUsuario(String username){
        LoginPOM.escribirUsuario(username);
    }

    @Step
    public void escribirClave(String password){
        LoginPOM.escribirClave(password);
    }

    @Step
    public void clicBotonLogin(){
        LoginPOM.clicBotonLogin();
    }

    @Step
    public void validarMensaje(){ LoginPOM.validarMensaje();}
}
