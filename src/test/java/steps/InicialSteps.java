package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InicialSteps{
	@Dado("que estou na pagina loja virtual")
	public void queEstouNaPaginaLojaVirtual() {
	    Driver.setUrl("http://www.lojaexemplodelivros.com.br/");
	}
	
	@Quando("realizo a busca do livro {string}")
	public void realizoABuscaDoLivro(String titulo) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Entao("valido o titulo sendo {string}")
	public void validoOTituloSendo(String titulo) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Entao("o preco sendo {string}")
	public void oPrecoSendo(String preco) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Quando("clico no livro pesquisado")
	public void clicoNoLivroPesquisado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Entao("confirmo o titulo sendo {string} e o preco sendo {string}")
	public void confirmoOTituloSendoEOPrecoSendo(String titulo, String preco) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Before
	public void abreNavegador() {
		Driver.abreNavegador();
	}
	
	@After
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}
}
