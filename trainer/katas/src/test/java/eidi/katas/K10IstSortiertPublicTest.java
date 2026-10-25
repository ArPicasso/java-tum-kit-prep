package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K10IstSortiertPublicTest {

    @Test
    void test1() {
        assertTrue(K10IstSortiert.istSortiert(new int[]{1, 2, 2, 5}));
    }
    @Test
    void test2() {
        assertFalse(K10IstSortiert.istSortiert(new int[]{1, 3, 2}));
    }
}
