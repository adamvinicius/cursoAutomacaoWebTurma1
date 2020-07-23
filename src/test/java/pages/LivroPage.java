package pages;

import map.LivroMap;

public class LivroPage {
	LivroMap livroMap = new LivroMap();
	
	public String getTitulo() {
		return livroMap.titulo.getText();
	}
	
	public String getPreco() {
		return livroMap.preco.getText();
	}
}
