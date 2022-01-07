package paginas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientesPage {

    private WebDriver navegador;

    public ClientesPage (WebDriver navegador){ this.navegador = navegador; }

    //função para acessar a pagina "Cadastro novo cliente"
    public NovoClientePage novoCliente(){
        navegador.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-round sc-gsTCUz bXZJLl sc-cBNfnY cHGPOa']")).click();

        return new NovoClientePage(navegador);
    }


    //função para conferir se o nome do cliente foi cadastrado corretamente
    public ClientesPage conferirNomeCliente (String nomeRegistrado){
            WebElement nomeCadastrado = navegador.findElement(By.xpath("//tbody/tr[1]/td[2]/span"));
            Assert.assertEquals(nomeRegistrado, nomeCadastrado.getText());

            return this;
    }

    //função para conferir se o email do cliente foi cadastrado corretamente
    public ClientesPage conferirEmailCliente (String emailRegistrado){
        WebElement emailCadastrado = navegador.findElement(By.xpath("//tbody/tr[1]/td[3]/span"));
        Assert.assertEquals(emailRegistrado, emailCadastrado.getText());

        return this;
    }


    //função para conferir se o telefone do cliente foi cadastrado corretamente
    public ClientesPage conferirTelefoneCliente (String telefoneRegistrado){
        WebElement telefoneCadastrado = navegador.findElement(By.xpath("//tbody/tr[1]/td[4]/span"));
        Assert.assertEquals(telefoneRegistrado, telefoneCadastrado .getText());

        return this;
    }

}
