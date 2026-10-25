package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K04EnthaeltPublicTest {

    @Test
    void test1() {
        assertTrue(K04Enthaelt.enthaelt(new int[]{4, 8, 15}, 8));
    }
    @Test
    void test2() {
        assertFalse(K04Enthaelt.enthaelt(new int[]{4, 8, 15}, 5));
    }
}
