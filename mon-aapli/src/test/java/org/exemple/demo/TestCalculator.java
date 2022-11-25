package org.exemple.demo;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {

	private calculator c ;
	calculator service =Mockito.mock(calculator.class);

	@Before
	public void setUp() throws Exception {
	this.c = new calculator();
	}
	@After
	public void tearDown() throws Exception {
	this.c = null;
	}
	
	@Test
	public void testAdd() {
		assertEquals(4,this.c.add(2,2));
	}
	@Test
	public void testMock() {
		assertEquals(5,this.c.add(3,2));
		when(service.add(4, 8)).thenReturn(5);
		assertEquals(5,service.add(4,8));
		verify(service).add(4, 8); // Vérifie si la méthode add() a été appelée
		verify(service,times(1)).add(4, 8);

			
	}

}
