package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.InicialPage;

public class InicialSteps{
	InicialPage inicialPage = new InicialPage();
	@Dado("que estou na pagina loja virtual")
	public void queEstouNaPaginaLojaVirtual() {
	    Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
	}
	
	@Quando("realizo a busca do livro {string}")
	public void realizoABuscaDoLivro(String titulo) {
	    inicialPage.setPesquisa(titulo, Keys.ENTER);
	}
	@Entao("valido o titulo sendo {string}")
	public void validoOTituloSendo(String titulo) {
	    assertEquals(titulo, inicialPage.getTituloLivro());
	}
	@Entao("o preco sendo {string}")
	public void oPrecoSendo(String preco) {
	    assertEquals(preco, inicialPage.getPreco());
	}
	@Quando("clico no livro pesquisado")
	public void clicoNoLivroPesquisado() {
	   inicialPage.clickTitulo();
	}
	
	
	
}
