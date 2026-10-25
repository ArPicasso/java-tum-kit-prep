package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K07PalindromPublicTest {

    @Test
    void test1() {
        assertTrue(K07Palindrom.istPalindrom("otto"));
    }
    @Test
    void test2() {
        assertFalse(K07Palindrom.istPalindrom("java"));
    }
}
