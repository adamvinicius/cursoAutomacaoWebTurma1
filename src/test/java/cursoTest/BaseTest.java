package cursoTest;

import org.junit.After;
import org.junit.Before;

import core.Driver;

public class BaseTest {
	
	@Before
	public void abreNavegador() {
		Driver.abreNavegador();
	}

	@After
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}
	
	
	
	
}
