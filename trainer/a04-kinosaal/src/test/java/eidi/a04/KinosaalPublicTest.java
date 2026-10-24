package eidi.a04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinosaalPublicTest {

    @Test
    void neuerSaalIstLeer() {
        Kinosaal k = new Kinosaal(3, 4);
        assertEquals(12, k.freiePlaetze());
    }

    @Test
    void buchenUndIstFrei() {
        Kinosaal k = new Kinosaal(2, 2);
        assertTrue(k.buche(1, 0));
        assertFalse(k.istFrei(1, 0));
        assertTrue(k.istFrei(0, 0));
    }

    @Test
    void doppeltBuchenGehtNicht() {
        Kinosaal k = new Kinosaal(2, 2);
        k.buche(0, 0);
        assertFalse(k.buche(0, 0));
    }

    @Test
    void freiePlaetzeInReihe() {
        Kinosaal k = new Kinosaal(2, 5);
        k.buche(0, 1);
        k.buche(0, 3);
        assertEquals(3, k.freiePlaetzeInReihe(0));
        assertEquals(5, k.freiePlaetzeInReihe(1));
    }

    @Test
    void findeBlockBeispiel() {
        Kinosaal k = new Kinosaal(1, 6);
        k.buche(0, 1);
        k.buche(0, 5);
        assertEquals(2, k.findeBlock(0, 3));
    }

    @Test
    void toStringBeispiel() {
        Kinosaal k = new Kinosaal(2, 3);
        k.buche(0, 1);
        assertEquals(".X.\n...", k.toString());
    }
}
