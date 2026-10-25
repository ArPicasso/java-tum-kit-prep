package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K24CaesarPublicTest {

    @Test
    void test1() {
        assertEquals("bcd", K24Caesar.caesar("abc", 1));
    }
    @Test
    void test2() {
        assertEquals("abc", K24Caesar.caesar("xyz", 3));
    }
}
