package eidi.a06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntListePublicTest {

    private IntListe liste(int... werte) {
        IntListe l = new IntListe();
        for (int w : werte) {
            l.hintenAnhaengen(w);
        }
        return l;
    }

    @Test
    void vorneEinfuegen() {
        IntListe l = new IntListe();
        l.vorneEinfuegen(5);
        l.vorneEinfuegen(8);
        assertEquals("[8, 5]", l.toString());
    }

    @Test
    void hintenAnhaengen() {
        assertEquals("[3, 8, 5]", liste(3, 8, 5).toString());
    }

    @Test
    void laenge() {
        assertEquals(3, liste(3, 8, 5).laenge());
    }

    @Test
    void get() {
        assertEquals(8, liste(3, 8, 5).get(1));
    }

    @Test
    void entferneErstesMitte() {
        IntListe l = liste(3, 8, 5);
        assertTrue(l.entferneErstes(8));
        assertEquals("[3, 5]", l.toString());
    }

    @Test
    void umdrehen() {
        IntListe l = liste(1, 2, 3);
        l.umdrehen();
        assertEquals("[3, 2, 1]", l.toString());
    }
}
