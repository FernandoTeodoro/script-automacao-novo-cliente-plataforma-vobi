package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver navegador;

    public HomePage (WebDriver navegador){
        this.navegador = navegador;
    }

    public NovoClientePage novoCliente(){
        navegador.findElement(By.xpath("//aside/ul/li[3]/button")).click();

        return new NovoClientePage(navegador);
    }

}
