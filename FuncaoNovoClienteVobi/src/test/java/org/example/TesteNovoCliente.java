package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import paginas.LoginPage;

public class TesteNovoCliente {

    Dotenv dotenv = Dotenv.load();
    String usuario = dotenv.get("USUARIO");
    String senha = dotenv.get("SENHA");
    private WebDriver navegador;

    @Test
    public void criandoNovoCliente(){

        this.navegador = new ChromeDriver();
        this.navegador.navigate().to("https://plataforma.vobi.com.br/login/profissional");
        this.navegador.manage().window().maximize();

        new LoginPage(navegador)
                .informarUsuario(this.usuario)
                .informarSenha(this.senha)
                .submeterFormularioDeLogin()
                .listaClientes();

        navegador.quit();

    }

}
