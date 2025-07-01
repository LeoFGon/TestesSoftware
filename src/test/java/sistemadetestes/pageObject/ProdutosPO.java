package sistemadetestes.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutosPO extends BasePO {
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(id = "btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id = "btn-sair")
	public WebElement buttonSair;
	
	@FindBy(id = "btn-adicionar")
	public WebElement buttonAdicionar;
	
	@FindBy(css = "div.modal-body>div.alert>span")
	public WebElement spanMensagem;
	

	/*
	 * Construtor padrão para a criação de uma nova instância na página de produtos
	 * @param driver Driver da página de produtos
	 */
	public ProdutosPO(WebDriver driver) {
		super(driver);
	}
	
	public String obterMensagem() {
		return this.spanMensagem.getText();
	}
	
	public void escrever(WebElement input, String texto) {
		input.clear();
		input.sendKeys(texto + Keys.TAB);
	}
	
	
	/**
	 * Método que tenta apagar as linhas dos campos
	 * Código, Nome, Quantidade, Valor e Data
	 */
	public void executarAcaoDeApagarLinhas() {
		escrever(inputCodigo, "");
		escrever(inputNome, "");
		escrever(inputQuantidade, "");
		escrever(inputValor, "");
		escrever(inputData, "");
	}
	
	/**
	 * Método que tenta cadastrar um produto a lista de produtos
	 * @param codigo Código do produto
	 * @param nome Nome do produto
	 * @param quantidade Quantidade do produto
	 * @param valor Valor do produto
	 * @param data Data de cadastro
	 * */
	public void executarAcaoDeCadastrar(String codigo, String nome, String quantidade, String valor, String data) {
		buttonAdicionar.click();
		escrever(inputCodigo, codigo);
		escrever(inputNome, nome);
		escrever(inputQuantidade, quantidade);
		escrever(inputValor, valor);
		escrever(inputData, data);
		buttonSalvar.click();
	}
	


}