package eidi.a03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenzenPublicTest {

    @Test
    void verschiebeAendertPunkt() {
        Punkt p = new Punkt(1, 2);
        Referenzen.verschiebe(p, 3, 4);
        assertEquals(4, p.x);
        assertEquals(6, p.y);
    }

    @Test
    void verschobenLiefertNeuenPunkt() {
        Punkt p = new Punkt(1, 2);
        Punkt q = Referenzen.verschoben(p, 1, 1);
        assertEquals(2, q.x);
        assertEquals(3, q.y);
    }

    @Test
    void tausche() {
        int[] feld = {1, 2, 3};
        Referenzen.tausche(feld, 0, 2);
        assertArrayEquals(new int[]{3, 2, 1}, feld);
    }

    @Test
    void kopiereFlachGleicheLaenge() {
        Punkt[] punkte = {new Punkt(1, 1), new Punkt(2, 2)};
        assertEquals(2, Referenzen.kopiereFlach(punkte).length);
    }

    @Test
    void kopiereTiefGleicheKoordinaten() {
        Punkt[] punkte = {new Punkt(1, 2)};
        Punkt[] kopie = Referenzen.kopiereTief(punkte);
        assertEquals(1, kopie[0].x);
        assertEquals(2, kopie[0].y);
    }

    @Test
    void vorhersageHatAchtAntworten() {
        assertEquals(8, Vorhersage.antworten().length);
    }
}
