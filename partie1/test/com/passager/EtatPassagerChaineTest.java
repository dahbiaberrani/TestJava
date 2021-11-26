package com.passager;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class EtatPassagerChaineTest {
    private EtatPassagerChaine passager1,passager2,passager3;
    @BeforeEach
    void setUp() {
        passager1 = new EtatPassagerChaine("DEHORS");
        passager2 = new EtatPassagerChaine("ASSIS");
        passager3 = new EtatPassagerChaine("DEBOUT");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void estExterieur() {

        assertTrue(passager1.estExterieur());
        assertFalse(passager1.estAssis());
        assertFalse(passager1.estDebout());
    }

    @Test
    void estAssis() {
        assertFalse(passager2.estExterieur());
        assertTrue(passager2.estAssis());
        assertFalse(passager2.estDebout());
    }

    @Test
    void estDebout() {
        assertFalse(passager3.estExterieur());
        assertFalse(passager3.estAssis());
        assertTrue(passager3.estDebout());
    }

    @Test
    void estInterieur() {
        assertFalse(passager1.estInterieur());
        assertTrue(passager2.estInterieur());
        assertTrue(passager3.estInterieur());
    }

    @Test
    void testToString() {
    }
}