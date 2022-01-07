package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientesPage {

    private WebDriver navegador;

    public ClientesPage (WebDriver navegador){ this.navegador = navegador; }

    public NovoClientePage listaClientes(){
        navegador.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-round sc-gsTCUz bXZJLl sc-cBNfnY cHGPOa']")).click();

        return new NovoClientePage(navegador);
    }

}
