package pages;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.Driver;
import map.InicialMap;

public class InicialPage {
	InicialMap inicialMap = new InicialMap();
	String elLivros = "ul.products-grid > li";
	String elPrecoLista = "span.price";
	String elTituloLivroLista = "h2 > a";
			
	public void setPesquisa(CharSequence... valor) {
		inicialMap.pesquisa.sendKeys(valor);
	}
	
	public String getTituloLivro() {
		String livro = inicialMap.tituloLivro.getText();
		return livro;
	}
	
	public String getPreco() {
		return inicialMap.preco.getText();
	}
	
	public String getPrecoLista() {
		List<WebElement> livros = inicialMap.livros.getElements();
		for (WebElement elLivro : livros) {
			inicialMap.tituloLivroLista.setWebElement(elLivro);
			String titulo = inicialMap.tituloLivroLista.getText();
			if (titulo.contains("Ajax com Java")) {
				inicialMap.precoLista.setWebElement(elLivro);
				return inicialMap.precoLista.getText();
			}
		}
		return null;
	}
}
