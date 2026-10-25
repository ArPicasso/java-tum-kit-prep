package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K18ZeilensummenPublicTest {

    @Test
    void test1() {
        assertArrayEquals(new int[]{3, 7, 11}, K18Zeilensummen.zeilensummen(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
    }
}
