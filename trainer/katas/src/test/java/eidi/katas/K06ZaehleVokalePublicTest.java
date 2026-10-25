package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K06ZaehleVokalePublicTest {

    @Test
    void test1() {
        assertEquals(4, K06ZaehleVokale.zaehleVokale("Informatik"));
    }
}
