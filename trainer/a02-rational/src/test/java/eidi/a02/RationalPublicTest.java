package eidi.a02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalPublicTest {

    @Test
    void ggTEinfach() {
        assertEquals(6, Rational.ggT(12, 18));
    }

    @Test
    void konstruktorKuerzt() {
        Rational r = new Rational(2, 4);
        assertEquals(1, r.getZaehler());
        assertEquals(2, r.getNenner());
    }

    @Test
    void addiere() {
        Rational summe = new Rational(1, 2).addiere(new Rational(1, 3));
        assertEquals(5, summe.getZaehler());
        assertEquals(6, summe.getNenner());
    }

    @Test
    void multipliziere() {
        Rational produkt = new Rational(2, 3).multipliziere(new Rational(3, 4));
        assertEquals("1/2", produkt.toString());
    }

    @Test
    void equalsGleicherWert() {
        assertTrue(new Rational(1, 2).equals(new Rational(3, 6)));
    }

    @Test
    void toStringBruch() {
        assertEquals("3/4", new Rational(3, 4).toString());
    }
}
