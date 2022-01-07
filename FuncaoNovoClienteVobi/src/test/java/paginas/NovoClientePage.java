package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovoClientePage {

    private WebDriver navegador;

    public NovoClientePage (WebDriver navegador){ this.navegador = navegador; }

    public NovoClientePage informarNomeCliente(String nomeCliente){
        WebElement campoNomeCliente = navegador.findElement(By.xpath("//input[@name='name']"));
        campoNomeCliente.sendKeys(nomeCliente);

        return this;
    }

    public NovoClientePage informarPessoaFisica(){
        navegador.findElement(By.xpath("//input[@value='pf']")).click();

        return this;
    }

    public NovoClientePage informarPessoaJuridica(){
        navegador.findElement(By.xpath("//input[@value='pj']")).click();

        return this;
    }

    public  NovoClientePage informarRG(String rgCliente){
        WebElement campoRG = navegador.findElement(By.xpath("//input[@name='rg']"));
        campoRG.sendKeys(rgCliente);

        return this;
    }

    public NovoClientePage informarEndereco(String enderecoCliente){
        WebElement campoEndereco = navegador.findElement(By.xpath("//input[@name='street']"));
        campoEndereco.sendKeys(enderecoCliente);

        return this;
    }

    public NovoClientePage informarNumero(String numeroCliente){
        WebElement campoNumero = navegador.findElement(By.xpath("//input[@name='number']"));
        campoNumero.sendKeys(numeroCliente);

        return this;
    }

    public NovoClientePage informarBairro(String bairroCliente){
        WebElement campoBairro = navegador.findElement(By.xpath("//input[@name='neighborhood']"));
        campoBairro.sendKeys(bairroCliente);

        return this;
    }

    public NovoClientePage informarObservacoes(String informacoesCliente){
        WebElement campoInformacoes = navegador.findElement(By.xpath("//div[@class='ql-editor']"));
        campoInformacoes.sendKeys(informacoesCliente);

        return this;
    }

    public NovoClientePage informarDataNascimento(String dataNascimentoCliente){
        WebElement campoDataNascimento = navegador.findElement(By.xpath("//input[@name='birthDate']"));
        campoDataNascimento.sendKeys(dataNascimentoCliente);

        return this;
    }

    public NovoClientePage informarCPF(String cpfCliente){
        WebElement campoCPF = navegador.findElement(By.xpath("//input[@id='doc']"));
        campoCPF.sendKeys(cpfCliente);

        return this;
    }

    public NovoClientePage informarEmail(String emailCliente){
        WebElement campoEmail = navegador.findElement(By.xpath("//input[@name='email']"));
        campoEmail.sendKeys(emailCliente);

        return this;
    }

    public NovoClientePage informarCEP(String cepCliente){
        WebElement campoCEP = navegador.findElement(By.xpath("//input[@name='zipcode']"));
        campoCEP.sendKeys(cepCliente);

        return this;
    }

    public NovoClientePage informarComplemento(String complementoCliente){
        WebElement campoComplemento = navegador.findElement(By.xpath("//input[@name='complement']"));
        campoComplemento.sendKeys(complementoCliente);

        return this;
    }

    public NovoClientePage informarCidade(String cidadeCliente){
        WebElement campoCidade = navegador.findElement(By.xpath("//input[@name='city']"));
        campoCidade.sendKeys(cidadeCliente);

        return this;
    }

    public NovoClientePage selecionarEstadoCliente(String estadoCliente){
        WebElement campoEstado = navegador.findElement(By.xpath("//input[@type='search']"));
        Select estadoSelecionado = new Select(campoEstado);
        estadoSelecionado.selectByVisibleText(estadoCliente);

        return this;
    }

    public ClientesPage submeterFormularioNovoCliente(){
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        return new ClientesPage(navegador);
    }

}
