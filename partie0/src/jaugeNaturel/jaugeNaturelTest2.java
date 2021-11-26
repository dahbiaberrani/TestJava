package jaugeNaturel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jaugeNaturelTest2 {

	jaugeNaturel jauge,falseJauge,jaugeMove;
	
	@Before
	public void setUp() throws Exception {
		jauge = new jaugeNaturel(-345,67899,100);
		falseJauge = new jaugeNaturel(50,25,30);
		jaugeMove = new jaugeNaturel(10,20,12);
		
	}

	@After
	public void tearDown() throws Exception {
		jauge = null;
	}

	@Test
	public void testDansIntervalle() {
		assertTrue("La valeur est dans l'intervalle", jauge.estVert() && !jauge.estRouge() && !jauge.estBleu());
	}
	
	@Test
	public void testLimiteVigieMaxInferieurVigieMin() {
		assertTrue("La vigie max est inferieure a la vigie min", falseJauge.estBleu() && falseJauge.estRouge() && !falseJauge.estVert());
}
	
}
