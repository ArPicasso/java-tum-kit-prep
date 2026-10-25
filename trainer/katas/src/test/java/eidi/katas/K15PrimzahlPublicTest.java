package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K15PrimzahlPublicTest {

    @Test
    void test1() {
        assertTrue(K15Primzahl.istPrimzahl(7));
    }
    @Test
    void test2() {
        assertFalse(K15Primzahl.istPrimzahl(9));
    }
}
