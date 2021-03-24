package StepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import screens.LoginScreen;

public class LoginSteps {

    LoginScreen login;

    public LoginSteps() {

        login = new LoginScreen();
    }

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
                this.login.validarInicio();
    }

    @Quando("informo um usuario valido")
    public void informoUmUsuarioValido() {
        this.login.logar();
    }

    @Entao("vejo a tela home")
    public void vejoATelaHome() {
                this.login.logado();
    }
}