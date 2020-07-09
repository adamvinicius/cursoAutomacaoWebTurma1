package map;

import core.Element;
import enums.ByValue;

public class InicialMap {
	public Element pesquisa = new Element(ByValue.ID, "search");
	public Element tituloLivro = new Element(ByValue.XPATH, "//h2/a");
	public Element preco = new Element(ByValue.CSS, "#product-price-44 > span");
}
