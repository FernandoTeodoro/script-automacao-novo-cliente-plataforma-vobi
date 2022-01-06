package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.function.Function;

public class LoginPage {

    private WebDriver navegador;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginPage informarUsuario(String usuario){
        WebElement campoUsuario = navegador.findElement(By.xpath("//input[@id='email']"));
        campoUsuario.sendKeys(usuario);

        return this;
    }

    public LoginPage informarSenha(String senha){
        WebElement campoSenha = navegador.findElement(By.xpath("//input[@id='password']"));
        campoSenha.sendKeys(senha);

        return this;
    }

    public HomePage submeterFormularioDeLogin(){
        navegador.findElement(By.xpath("//button[text()='Entrar']")).click();

//        new WebDriverWait(navegador, Duration.ofSeconds(3))
//                .until(ExpectedConditions.visibilityOfAllElements());

        new WebDriverWait(navegador, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[text()='Olá, Escritório']")));


        return new HomePage(navegador);
    }

}
