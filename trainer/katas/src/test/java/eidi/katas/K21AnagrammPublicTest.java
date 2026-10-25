package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K21AnagrammPublicTest {

    @Test
    void test1() {
        assertTrue(K21Anagramm.istAnagramm("listen", "silent"));
    }
    @Test
    void test2() {
        assertFalse(K21Anagramm.istAnagramm("aab", "abb"));
    }
}
