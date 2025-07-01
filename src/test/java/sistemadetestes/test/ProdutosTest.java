package sistemadetestes.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sistemadetestes.pageObject.ProdutosPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProdutosTest extends BaseTest{
	
	private static ProdutosPO ProdutosPage;
	
	@BeforeClass
	public static void prepararTestes() {
		ProdutosPage = new ProdutosPO(driver);
	}
	
	@Test
	public void TC006_naoDeveCadastrarProdutoComCamposVazios() {
		ProdutosPage.buttonAdicionar.click();
		ProdutosPage.executarAcaoDeCadastrar("", "", "", "", "");
		
		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC007_naoDeveCadastrarProdutoComCodigoVazio() {
		ProdutosPage.escrever(ProdutosPage.inputCodigo, "");
		ProdutosPage.escrever(ProdutosPage.inputNome, "Ferro");
		ProdutosPage.escrever(ProdutosPage.inputQuantidade, "10");
		ProdutosPage.escrever(ProdutosPage.inputValor, "100");
		ProdutosPage.escrever(ProdutosPage.inputData, "10101999");
		
		ProdutosPage.buttonSalvar.click();;

		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC008_naoDeveCadastrarProdutoComNomeVazio() {
		ProdutosPage.executarAcaoDeApagarLinhas();
		
		ProdutosPage.escrever(ProdutosPage.inputCodigo, "1");
		ProdutosPage.escrever(ProdutosPage.inputNome, "");
		ProdutosPage.escrever(ProdutosPage.inputQuantidade, "10");
		ProdutosPage.escrever(ProdutosPage.inputValor, "200");
		ProdutosPage.escrever(ProdutosPage.inputData, "10101999");
		
		ProdutosPage.buttonSalvar.click();;

		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC009_naoDeveCadastrarProdutoComQuantidadeVazio() {
		ProdutosPage.executarAcaoDeApagarLinhas();

		ProdutosPage.escrever(ProdutosPage.inputCodigo, "1");
		ProdutosPage.escrever(ProdutosPage.inputNome, "Ferro");
		ProdutosPage.escrever(ProdutosPage.inputQuantidade, "");
		ProdutosPage.escrever(ProdutosPage.inputValor, "200");
		ProdutosPage.escrever(ProdutosPage.inputData, "10101999");
		
		ProdutosPage.buttonSalvar.click();;

		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	
	@Test
	public void TC010_naoDeveCadastrarProdutoComValorVazio() {
		ProdutosPage.executarAcaoDeApagarLinhas();

		ProdutosPage.escrever(ProdutosPage.inputCodigo, "1");
		ProdutosPage.escrever(ProdutosPage.inputNome, "Ferro");
		ProdutosPage.escrever(ProdutosPage.inputQuantidade, "10");
		ProdutosPage.escrever(ProdutosPage.inputValor, "");
		ProdutosPage.escrever(ProdutosPage.inputData, "10101999");
		
		ProdutosPage.buttonSalvar.click();;

		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	@Test
	public void TC011_naoDeveCadastrarProdutoComDataVazia() {
		ProdutosPage.executarAcaoDeApagarLinhas();

		ProdutosPage.escrever(ProdutosPage.inputCodigo, "1");
		ProdutosPage.escrever(ProdutosPage.inputNome, "Ferro");
		ProdutosPage.escrever(ProdutosPage.inputQuantidade, "10");
		ProdutosPage.escrever(ProdutosPage.inputValor, "200");
		ProdutosPage.escrever(ProdutosPage.inputData, "");
		
		ProdutosPage.buttonSalvar.click();;

		
		String mensagem = ProdutosPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
	}
	
	
	
}