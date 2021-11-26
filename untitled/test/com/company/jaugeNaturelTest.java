package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Université Toulouse 2 Jean Jaures
 * L3 MIASHS 2021-2022
 * BERRANI Dahbia
 * berrani.dehbia1993@gmail.com
 */

class jaugeNaturelTest {
    private jaugeNaturel jauge1,jauge2,jauge3;
    @BeforeEach
    void setUp() {
        jauge1 = new jaugeNaturel(1,100,100);
        jauge2 = new jaugeNaturel(1,100,50);
        jauge3 = new jaugeNaturel(1,100,1);

    }

    @AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void estRouge() {
        assertFalse(!jauge1.estRouge(),"estVert() devrait renvoyer false");
        assertFalse(jauge2.estRouge(),"estVert() devrait renvoyer true");
        assertFalse(jauge3.estRouge(),"estVert() devrait renvoyer false");
    }


    @org.junit.jupiter.api.Test
    void estVert() {
        assertFalse(jauge1.estVert(),"estVert() devrait renvoyer false");
        assertTrue(jauge2.estVert(),"estVert() devrait renvoyer true");
        assertFalse(jauge3.estVert(),"estVert() devrait renvoyer false");
    }

    @org.junit.jupiter.api.Test
    void estBleu() {

        assertFalse(jauge1.estBleu(),"estBleu() devrait renvoyer false");
        assertTrue(!jauge2.estBleu(),"estBleu() devrait renvoyer true");
        assertFalse(jauge3.estBleu(),"estBleu() devrait renvoyer false");
    }

    @org.junit.jupiter.api.Test
    void incrementer() {
        jaugeNaturel jauge4 = new  jaugeNaturel(0, 50, 49);
        assertFalse(jauge4.estRouge());
        jauge4.incrementer();
        assertTrue(jauge4.estRouge());
    }

    @org.junit.jupiter.api.Test
    void decrementer() {

        jaugeNaturel jauge5 = new  jaugeNaturel(10, 5, 11);
        assertFalse(jauge5.estBleu());
        jauge5.decrementer();
        assertTrue(jauge5.estBleu());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}