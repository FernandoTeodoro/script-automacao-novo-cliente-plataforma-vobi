package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver navegador;

    public LoginPage(WebDriver navegador){ this.navegador = navegador; }

    //função para informar o email do usuário para logar no sistema
    public LoginPage informarUsuario(String usuario){
        WebElement campoUsuario = navegador.findElement(By.xpath("//input[@id='email']"));
        campoUsuario.sendKeys(usuario);

        return this;
    }

    //função para informar a senha do usuário para logar no sistema
    public LoginPage informarSenha(String senha){
        WebElement campoSenha = navegador.findElement(By.xpath("//input[@id='password']"));
        campoSenha.sendKeys(senha);

        return this;
    }

    //funçãoo para submeter o formulário de login e acessar a home page da plataforma
    public HomePage submeterFormularioDeLogin(){
        navegador.findElement(By.xpath("//button[text()='Entrar']")).click();

//        new WebDriverWait(navegador, Duration.ofSeconds(3))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Olá, Escritório']")));

        return new HomePage(navegador);
    }

}
