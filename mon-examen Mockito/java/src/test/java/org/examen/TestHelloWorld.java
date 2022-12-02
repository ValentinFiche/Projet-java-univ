package org.examen;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestHelloWorld {

	private helloWorld c ;
	helloWorld service =Mockito.mock(helloWorld.class);

	@Before
	public void setUp() throws Exception {
	this.c = new helloWorld("hello world");
	}
	@After
	public void tearDown() throws Exception {
	this.c = null;
	}
	
	@Test
	public void testAdd() {
		assertEquals("hello world",this.c.print());
	}
	@Test
	public void testMock() {
		assertEquals("hello world",this.c.print());
		when(service.print()).thenReturn("hello world");
		assertEquals("hello world",service.print());
		verify(service).print(); // Vérifie si la méthode add() a été appelée
		verify(service,times(1)).print();

			
	}

}
