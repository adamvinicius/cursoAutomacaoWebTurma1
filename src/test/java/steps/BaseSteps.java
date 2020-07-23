package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
	@Before
	public void abreNavegador() {
		Driver.abreNavegador();
	}
	
	@After
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}
}
