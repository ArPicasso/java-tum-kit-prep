package eidi.a05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortierenPublicTest {

    @Test
    void sortiereEinfach() {
        int[] feld = {5, 2, 4, 1, 3};
        Sortieren.sortiereDurchEinfuegen(feld);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, feld);
    }

    @Test
    void istSortiert() {
        assertTrue(Sortieren.istSortiert(new int[]{1, 2, 3}));
        assertFalse(Sortieren.istSortiert(new int[]{3, 1, 2}));
    }

    @Test
    void binaereSucheGefunden() {
        assertEquals(3, Sortieren.binaereSuche(new int[]{1, 3, 5, 7, 9}, 7));
    }

    @Test
    void binaereSucheNichtGefunden() {
        assertEquals(-1, Sortieren.binaereSuche(new int[]{1, 3, 5, 7, 9}, 4));
    }

    @Test
    void mischeBeispiel() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 9, 10, 11},
                Sortieren.mische(new int[]{1, 4, 9}, new int[]{2, 3, 10, 11}));
    }
}
