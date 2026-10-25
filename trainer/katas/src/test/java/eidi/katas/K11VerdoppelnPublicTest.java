package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K11VerdoppelnPublicTest {

    @Test
    void test1() {
        int[] f = {1, 5, -2};
        K11Verdoppeln.verdoppleAlle(f);
        assertArrayEquals(new int[]{2, 10, -4}, f);
    }
}
