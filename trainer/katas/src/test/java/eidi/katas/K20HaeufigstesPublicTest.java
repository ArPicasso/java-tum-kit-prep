package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K20HaeufigstesPublicTest {

    @Test
    void test1() {
        assertEquals(3, K20Haeufigstes.haeufigstes(new int[]{3, 1, 3, 2, 1, 3}));
    }
}
