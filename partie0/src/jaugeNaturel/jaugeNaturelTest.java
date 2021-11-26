package jaugeNaturel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jaugeNaturelTest {

	jaugeNaturel jauge1,jauge2,jauge3;
	
	@Before
	public void setUp() {
		jauge1 = new jaugeNaturel(1,100,100);
		jauge2 = new jaugeNaturel(1,100,50);
		jauge3 = new jaugeNaturel(1,100,1);
		
	}

	@After
	public void tearDown()  {
		jauge1 = null;
		jauge2 = null;
		jauge3 = null;
	}

	@Test
	public void testJaugeNaturel() {
		assertNotNull("ma jauge est bien cr�e",jauge1);
		assertNotNull("ma jauge est bien cr�e",jauge2);
		assertNotNull("ma jauge est bien cr�e",jauge3);

	}

	@Test
	public void testEstRouge() {
		assertFalse("estRouge() devrait renvoyer false",jauge2.estRouge());
		assertFalse("estRouge() devrait renvoyer false",jauge3.estRouge());
		
		assertTrue("ma jauge est rouge", jauge1.estRouge());
	}

	@Test
	public void testEstVert() {
		assertFalse("estVert() devrait renvoyer false",jauge1.estVert());
		assertFalse("estVert() devrait renvoyer false",jauge3.estVert());
		
		assertTrue("ma jauge est verte", jauge2.estVert());
	}

	@Test
	public void testEstBleu() {
		assertFalse("estBleu() devrait renvoyer false",jauge1.estBleu());
		assertFalse("estBleu() devrait renvoyer false",jauge2.estBleu());
		
		assertTrue("ma jauge est Bleue", jauge3.estBleu());
	}

	@Test
	public void testIncrementer() {
		jauge3.incrementer();
		assertFalse("estBleu() devrait renvoyer false",jauge3.estBleu());
		
		assertTrue("ma jauge est verte", jauge3.estVert());
		jauge3.decrementer();
	}

	@Test
	public void testDecrementer() {
		jauge1.decrementer();
		assertFalse("estBleu() devrait renvoyer false",jauge1.estRouge());
		
		assertTrue("ma jauge est verte", jauge1.estVert());
		jauge1.incrementer();
	}

	@Test
	public void testToString() {
		jauge1.toString();
	}

	
}
