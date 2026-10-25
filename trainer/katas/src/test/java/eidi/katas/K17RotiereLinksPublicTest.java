package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K17RotiereLinksPublicTest {

    @Test
    void test1() {
        int[] f = {1, 2, 3, 4};
        K17RotiereLinks.rotiereLinks(f);
        assertArrayEquals(new int[]{2, 3, 4, 1}, f);
    }
}
