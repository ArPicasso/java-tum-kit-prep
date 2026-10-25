package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K14ZaehleWortPublicTest {

    @Test
    void test1() {
        assertEquals(2, K14ZaehleWort.zaehleWort(new String[]{"Hallo", "Welt", "Hallo"}, "Hallo"));
    }
}
