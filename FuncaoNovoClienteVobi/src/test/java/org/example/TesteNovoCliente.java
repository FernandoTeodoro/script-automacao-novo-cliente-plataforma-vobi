package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNovoCliente {

    @Test
    public void criandoNovoCliente(){

        Dotenv dotenv = Dotenv.load();
        String usuario = dotenv.get("USUARIO");
        String senha = dotenv.get("SENHA");
        WebDriver driver = new ChromeDriver();

    }

}
