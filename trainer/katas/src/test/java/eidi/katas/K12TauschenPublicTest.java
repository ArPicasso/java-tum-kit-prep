package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K12TauschenPublicTest {

    @Test
    void test1() {
        int[] f = {7, 8, 9};
        K12Tauschen.tausche(f, 0, 2);
        assertArrayEquals(new int[]{9, 8, 7}, f);
    }
}
