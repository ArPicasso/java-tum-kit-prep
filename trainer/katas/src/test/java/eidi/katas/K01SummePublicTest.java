package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K01SummePublicTest {

    @Test
    void test1() {
        assertEquals(6, K01Summe.summe(new int[]{1, 2, 3}));
    }
}
