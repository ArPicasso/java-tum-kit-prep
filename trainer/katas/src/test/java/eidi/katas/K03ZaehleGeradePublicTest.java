package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K03ZaehleGeradePublicTest {

    @Test
    void test1() {
        assertEquals(2, K03ZaehleGerade.zaehleGerade(new int[]{1, 2, 4, 7}));
    }
}
