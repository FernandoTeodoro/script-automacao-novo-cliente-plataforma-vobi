package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovoClientePage {

    private WebDriver navegador;

    public NovoClientePage (WebDriver navegador){ this.navegador = navegador; }

    //função para inserir o nome do cliente no formulário de novo cliente
    public NovoClientePage informarNomeCliente(String nomeCliente){
        WebElement campoNomeCliente = navegador.findElement(By.xpath("//input[@name='name']"));
        campoNomeCliente.sendKeys(nomeCliente);

        return this;
    }

    //função para selecionar a opção de Pessoa Fisica no formulário de novo cliente
    public NovoClientePage informarPessoaFisica(){
        navegador.findElement(By.xpath("//input[@value='pf']")).click();

        return this;
    }

    //função para selecionar a opção de Pessoa Juridica no formulário de novo cliente
    public NovoClientePage informarPessoaJuridica(){
        navegador.findElement(By.xpath("//input[@value='pj']")).click();

        return this;
    }

    //função para inserir o RG do cliente no formulário de novo cliente
    public  NovoClientePage informarRG(String rgCliente){
        WebElement campoRG = navegador.findElement(By.xpath("//input[@name='rg']"));
        campoRG.sendKeys(rgCliente);

        return this;
    }


    //função para inserir o telefone do cliente no formulário de novo cliente
    public  NovoClientePage informarTelefone(String telefoneCliente){
        WebElement campoTelefone = navegador.findElement(By.xpath("//input[@name='phone']"));
        campoTelefone.sendKeys(telefoneCliente);

        return this;
    }

    //função para inserir o endereço do cliente no formulário de novo cliente
    public NovoClientePage informarEndereco(String enderecoCliente){
        WebElement campoEndereco = navegador.findElement(By.xpath("//input[@name='street']"));
        campoEndereco.sendKeys(enderecoCliente);

        return this;
    }

    //função para inserir o numero da casa do cliente no formulário de novo cliente
    public NovoClientePage informarNumero(String numeroCliente){
        WebElement campoNumero = navegador.findElement(By.xpath("//input[@name='number']"));
        campoNumero.sendKeys(numeroCliente);

        return this;
    }

    //função para inserir o bairro do cliente no formulário de novo cliente
    public NovoClientePage informarBairro(String bairroCliente){
        WebElement campoBairro = navegador.findElement(By.xpath("//input[@name='neighborhood']"));
        campoBairro.sendKeys(bairroCliente);

        return this;
    }

    //função para inserir observações no formulário de novo cliente
    public NovoClientePage informarObservacoes(String informacoesCliente){
        WebElement campoInformacoes = navegador.findElement(By.xpath("//div[@class='ql-editor']"));
        campoInformacoes.sendKeys(informacoesCliente);

        return this;
    }

    //função para inserir a data de nascimento do cliente no formulário de novo cliente
    public NovoClientePage informarDataNascimento(String dataNascimentoCliente){
        WebElement campoDataNascimento = navegador.findElement(By.xpath("//input[@name='birthDate']"));
        campoDataNascimento.sendKeys(dataNascimentoCliente);

        return this;
    }

    //função para inserir o CPF do cliente no formulário de novo cliente
    public NovoClientePage informarCPF(String cpfCliente){
        WebElement campoCPF = navegador.findElement(By.xpath("//input[@id='doc']"));
        campoCPF.sendKeys(cpfCliente);

        return this;
    }

    //função para inserir o email do cliente no formulário de novo cliente
    public NovoClientePage informarEmail(String emailCliente){
        WebElement campoEmail = navegador.findElement(By.xpath("//input[@name='email']"));
        campoEmail.sendKeys(emailCliente);

        return this;
    }

    //função para inserir o CEP do cliente no formulário de novo cliente
    public NovoClientePage informarCEP(String cepCliente){
        WebElement campoCEP = navegador.findElement(By.xpath("//input[@name='zipcode']"));
        campoCEP.sendKeys(cepCliente);

        return this;
    }

    //função para inserir o complemento do endereço do cliente no formulário de novo cliente
    public NovoClientePage informarComplemento(String complementoCliente){
        WebElement campoComplemento = navegador.findElement(By.xpath("//input[@name='complement']"));
        campoComplemento.sendKeys(complementoCliente);

        return this;
    }

    //função para inserir a cidade do cliente no formulário de novo cliente
    public NovoClientePage informarCidade(String cidadeCliente){
        WebElement campoCidade = navegador.findElement(By.xpath("//input[@name='city']"));
        campoCidade.sendKeys(cidadeCliente);

        return this;
    }


    //função para selecionar o estado do cliente no formulário de novo cliente
    public NovoClientePage selecionarEstadoCliente(String estadoCliente){
        WebElement campoEstado = navegador.findElement(By.xpath("//input[@type='search']"));
        Select estadoSelecionado = new Select(campoEstado);
        estadoSelecionado.selectByVisibleText(estadoCliente);

        return this;
    }


    //função para submeter o formulário de novo cliente e salvar suas informações na plataforma
    public ClientesPage submeterFormularioNovoCliente(){
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        return new ClientesPage(navegador);
    }

}
