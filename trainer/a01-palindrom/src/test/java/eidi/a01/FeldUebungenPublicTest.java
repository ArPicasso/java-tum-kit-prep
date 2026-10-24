package eidi.a01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeldUebungenPublicTest {

    @Test
    void palindromFeldUngeradeLaenge() {
        assertTrue(FeldUebungen.istPalindrom(new int[]{1, 2, 3, 2, 1}));
    }

    @Test
    void keinPalindromFeld() {
        assertFalse(FeldUebungen.istPalindrom(new int[]{1, 2, 3}));
    }

    @Test
    void palindromWort() {
        assertTrue(FeldUebungen.istPalindrom("otto"));
    }

    @Test
    void keinPalindromWort() {
        assertFalse(FeldUebungen.istPalindrom("java"));
    }

    @Test
    void umgedrehtLiefertUmgekehrteReihenfolge() {
        assertArrayEquals(new int[]{3, 2, 1}, FeldUebungen.umgedreht(new int[]{1, 2, 3}));
    }

    @Test
    void umdrehenAendertFeld() {
        int[] feld = {1, 2, 3, 4};
        FeldUebungen.umdrehen(feld);
        assertArrayEquals(new int[]{4, 3, 2, 1}, feld);
    }
}
